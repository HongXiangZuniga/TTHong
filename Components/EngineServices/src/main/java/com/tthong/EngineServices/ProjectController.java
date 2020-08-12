package com.tthong.EngineServices;

import com.tthong.IModel.IModel;
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
public class ModelController {

    @Autowired
    private ModelRepository repository;

    @Autowired
    private EntityLinks entityLinks;

    @RequestMapping("/init")
    public Model init(){
        Model model = new Model();
        repository.save(model);
        return model;
    }



    @RequestMapping("/Model")
    public Map<String, String> model(@RequestBody final String body) throws JSONException, UnsupportedEncodingException {

        //Cargado de datos del JSON de Entrada.
        try {
            Steps steps = new Steps();
            String state;
            String next;
            HashMap<String, String> map = new HashMap<>();
            JSONObject jsbody = new JSONObject(body); // Body del Json
            Json2Model json2Model = new Json2Model();


            //donde no se encuentra el ID
            if (repository.findByid(jsbody.getString("id")).size() == 0) {
                map.put("error","id not found");
                return map;
            }

            //Se extrae el estado y el actual
            state =repository.findByid(jsbody.getString("id")).get(0).now();
            Model model2 = json2Model.transform(jsbody);
            model2.setState(state);

            //Caso de estar validado
            if(state.equals("Vanilla")&& model2.IModel.getValidator().size()!=0){
                if(model2.IModel.getValidator().get(0).equals("SecretKey"))
                model2.setState(steps.update(state));
            }
            next = steps.next(state);
            map.put("next",next);
            System.out.println(next);
            //Se guarda la actualizacion 
            repository.save(model2);

            //Se entrega el retorno
            return map;


            }catch(Exception e){
                System.out.println(e.toString());
                HashMap<String, String> maperror = new HashMap<>();
                maperror.put("error", e.toString());
                return maperror;
            }
        }
















    }

