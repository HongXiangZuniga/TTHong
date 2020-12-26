package com.tthong.EngineServices;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    @PostMapping("/next")
    public Map<String, Boolean> next(@RequestBody final JSONObject body){
        try{
            HashMap<String, Boolean> map = new HashMap<>();
            Steps steps = new Steps();
            String id = body.getAsString("id");
            Project project = repository.findByid(id).get(0);
            project.setState(steps.next(project.now()));
            repository.save(project);
            map.put("status",true);
            return map;
        }catch (Exception e){
            HashMap<String, Boolean > map = new HashMap<>();
            map.put("status",false);
            return map;
        }
    }
    @PostMapping("/reset")
    public Map<String, Boolean> reset(@RequestBody final JSONObject body){
        try{
            HashMap<String, Boolean> map = new HashMap<>();
            Steps steps = new Steps();
            String id = body.getAsString("id");
            Project project = repository.findByid(id).get(0);
            project.setState("Vanilla");
            repository.save(project);
            map.put("status",true);
            return map;
        }catch (Exception e){
            HashMap<String, Boolean > map = new HashMap<>();
            map.put("status",false);
            return map;
        }
    }
    /*Cambiar por url*/
    @PostMapping("/state")
    public Map<String, String> state(@RequestBody final JSONObject body){
        try{
            HashMap<String, String> map = new HashMap<>();
            Steps steps = new Steps();
            String id = body.getAsString("id");
            Project project = repository.findByid(id).get(0);
            map.put("state",project.now());
            return map;
        }catch (Exception e){
            HashMap<String, String > map = new HashMap<>();
            map.put("state","error");
            return map;
        }
    }
    @PostMapping("/back")
    public Map<String, Boolean> back(@RequestBody final JSONObject body){
        try{
            HashMap<String, Boolean> map = new HashMap<>();
            Steps steps = new Steps();
            String id = body.getAsString("id");
            Project project = repository.findByid(id).get(0);
            String state = project.now();

            ArrayList<String> states = new ArrayList<>();
            states.add("Vanilla");
            states.add("IStarValidated");
            states.add("IStar2AC");
            states.add("ACValidated");
            states.add("AC2OOM");
            states.add("OOMValidated");
            states.add("Finish");

            if(state.equals("Vanilla")){
                map.put("state",false);
                return map;
            }
            for(int i = 1;i<states.size();i++){
                if(state.equals(states.get(i))){
                    project.setState(states.get(i-1));
                    repository.save(project);
                    map.put("state",true);
                    return map;
                }
            }
            map.put("state",false);
            return map;
        }catch (Exception e){
            HashMap<String, Boolean > map = new HashMap<>();
            map.put("state",null);
            return map;
        }
    }
}

