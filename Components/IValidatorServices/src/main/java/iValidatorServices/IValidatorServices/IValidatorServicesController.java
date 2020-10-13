package iValidatorServices.IValidatorServices;

import IStarModel.IstarModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class IValidatorServicesController {
    @RequestMapping("/")
    public Map<String, String> nextModel(@RequestBody final String body) throws JSONException, UnsupportedEncodingException {
        try {
            IstarModel istarModel = new IstarModel();
            JSONObject JsonIModel = new JSONObject(body).getJSONObject("model_i");
            JSONArray actors = new JSONObject(body).getJSONObject("model_i").getJSONObject("model").getJSONArray("actors");
            JSONArray links = new JSONObject(body).getJSONObject("model_i").getJSONObject("model").getJSONArray("links");
            JSONArray dependencies = new JSONObject(body).getJSONObject("model_i").getJSONObject("model").getJSONArray("dependencies");

            istarModel.load(actors,links,dependencies);
            istarModel.GeneralValidate();
            System.out.println(istarModel.getErrors());
            HashMap<String, String> map = new HashMap<>();
            map.put("StatusLoad","aux");
            return map;
        }catch(Exception e){
        System.out.println(e.toString());
        HashMap<String, String> maperror = new HashMap<>();
        maperror.put("error", e.toString());
        return null;
    }
    }
}
