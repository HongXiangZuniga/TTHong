package com.tthong.EngineServices;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {

    @Autowired
    private ModelRepository repository;

    @Autowired
    private EntityLinks entityLinks;

    @RequestMapping("/model")
    public Map<String, String> model(@RequestBody final String body) throws JSONException, UnsupportedEncodingException {
        final HashMap<String, String> map = new HashMap<>();
        try{
            final JSONObject js = new JSONObject(body);
            if (js.isNull("id") != false) {
                System.out.println("y");
                final Model model = new Model();
                repository.save(model);
                final String link = entityLinks.linkForItemResource(model.getClass(), model.getId()).toString();
                map.put("pointAcess", link);
                map.put("id", model.getId());
                map.put("errors", model.getErrors());
                map.put("model", model.getModel());
                return map;
            } else {
                JSONObject js2 = new JSONObject(js.getString("errors"));
                JSONObject js3 = new JSONObject(js.getString("model"));
                Model model = new Model();
                model = repository.findByid(js.getString("id")).get(0);
                if (model.getState().equals("Vanila")) {
                    map.put("next", "validator");
                    if(js2.getString("check").equals("true")){
                        repository.save(new Model(js.getString("id"),"Validated",js.getString("errors"),js.getString("model")));
                    }
                }


                model = repository.findByid(js.getString("id")).get(0);
                if (model.getState().equals("Validated")) {
                    map.put("next", "transformator");
                    if(js3.getString("name").equals("pro")){
                        repository.save(new Model(js.getString("id"),"Transformated",js.getString("errors"),js.getString("model")));
                    }
                }


                model = repository.findByid(js.getString("id")).get(0);
                if (model.getState().equals("Transformated")) {
                    map.put("next", "finish");
                }

                
                
                map.put("model", model.getModel());
                return map;
            }
    
        }catch (final Exception e){
             final HashMap<String, String> mape = new HashMap<>();
             mape.put("error", e.toString());
             return mape;
        }
        
    
    }
}