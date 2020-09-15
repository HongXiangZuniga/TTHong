package com.tthong.EngineServices;



import com.tthong.Json2Model.Json2Model;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;




@RestController
public class ProjectController {

    @Autowired
    private ProjectRepository repository;

    @Autowired
    private EntityLinks entityLinks;

    @RequestMapping("/init")
    public Project init(){
        Project project = new Project();
        repository.save(project);
        return project;
    }

    @RequestMapping("/next")
    public Map<String, String> nextModel(@RequestBody final String body) throws JSONException, UnsupportedEncodingException {
        try {
            Steps steps = new Steps();
            String next;
            String state;
            HashMap<String, String> map = new HashMap<>();
            JSONObject jsbody = new JSONObject(body); // Body del Json
            Json2Model json2Model = new Json2Model();
            if (repository.findByid(jsbody.getString("id")).size() == 0) {
                map.put("error","id not found");
                return map;
            }
            state =repository.findByid(jsbody.getString("id")).get(0).now();
            Project project2 = json2Model.transform(jsbody);
            project2.setState(state);
            next = steps.next(state);
            map.put("next",next);
            return map;
        }catch(Exception e){
            System.out.println(e.toString());
            HashMap<String, String> maperror = new HashMap<>();
            maperror.put("error", e.toString());
            return maperror;
        }
    }




    @RequestMapping("/Model")
    public Map<String, String> model(@RequestBody final String body) throws JSONException, UnsupportedEncodingException {
        String key = "abc";
        Boolean updateState = true;
        //Cargado de datos del JSON de Entrada.
        try {
            Steps steps = new Steps();
            String state;
            HashMap<String, String> map = new HashMap<>();
            JSONObject jsbody = new JSONObject(body); // Body del Json
            Json2Model json2Model = new Json2Model();


            //donde no se encuentra el ID
            if (repository.findByid(jsbody.getString("id")).size() == 0) {
                map.put("error","id not found");
                return map;
            }

            //Se extrae el estado actual el get(0) porque retorna una lista.
            state =repository.findByid(jsbody.getString("id")).get(0).now();
            Project project2 = json2Model.transform(jsbody);
            project2.setState(state);


            //Caso de que ya fue validado
            if(state.equals("IStarValidated")){
                if(project2.IModel.getValidator().get(0).equals(key)!=true){
                    updateState = false;
                }
            }
            if(state.equals("ACValidated")){
                if(project2.ACModel.getValidator().get(0).equals(key)!=true){
                    updateState = false;
                }
            }
            if(state.equals("OOMValidated")){
                if(project2.OOModel.getValidator().get(0).equals(key)!=true){
                    updateState = false;
                }
            }
            if(state.equals("Finish")){
                updateState = false;
            }

            if(updateState == true){
                project2.setState(steps.next(project2.now()));
            }
            repository.save(project2);

            //Se entrega el retorno
            map.put("Save","true");
            return map;


            }catch(Exception e){
                System.out.println(e.toString());
                HashMap<String, String> maperror = new HashMap<>();
                maperror.put("error", e.toString());
                return maperror;
            }
        }
















    }

