package iValidatorServices.IValidatorServices;

import IStarModel.IstarModel;
import extra.toResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.*;

@RestController
public class IValidatorServicesController {
    @RequestMapping("/")
    public Map<String, ArrayList<String>> nextModel(@RequestBody final String body) throws JSONException, UnsupportedEncodingException {
        try {
            String secretKey = "abc";
            IstarModel istarModel = new IstarModel();
            JSONObject JsonIModel = new JSONObject(body).getJSONObject("model_i");
            JSONArray actors = new JSONObject(body).getJSONObject("model_i").getJSONObject("model").getJSONArray("actors");
            JSONArray links = new JSONObject(body).getJSONObject("model_i").getJSONObject("model").getJSONArray("links");
            JSONArray dependencies = new JSONObject(body).getJSONObject("model_i").getJSONObject("model").getJSONArray("dependencies");

            istarModel.load(actors, links, dependencies);
            istarModel.GeneralValidate();
            HashMap<String, ArrayList<String>> maperror = new HashMap<>();
            toResponse toresponse = new toResponse();
            toresponse.transform(istarModel.getErrors(), maperror,secretKey);
            System.out.println("-------");
            for(int i=0;i<istarModel.getNodes().size();i++){
                System.out.println(istarModel.getNodes().get(i).getName());
            }
            System.out.println("-------");
            return maperror;
        } catch (Exception e) {
            HashMap<String, ArrayList<String>> maperror = new HashMap<>();
            ArrayList<String> aux = new ArrayList<>();
            aux.add("UndefinedError");
            maperror.put("validator", aux);
            return maperror;
        }
    }
}

