package com.tthong.EngineServices;



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
       
        
        return null;

    }




    @RequestMapping("/model")
    public Map<String, String> model(@RequestBody final String body) throws JSONException, UnsupportedEncodingException {
        String key = System.getenv("SECRET_KEY");

        


        Boolean updateState = true;
   

        return null;
        }
















    }

