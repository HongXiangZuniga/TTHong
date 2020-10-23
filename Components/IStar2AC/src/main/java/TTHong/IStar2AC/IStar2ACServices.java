package TTHong.IStar2AC;

import IStarModel.IstarModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

@RestController
public class IStar2ACServices {
    @RequestMapping("/")
    public Map<String, ArrayList<String>> nextModel(@RequestBody final String body) throws JSONException, UnsupportedEncodingException {
        try {
            IstarModel istarModel = new IstarModel();
            JSONObject JsonIModel = new JSONObject(body).getJSONObject("model_i");
            JSONArray actors = new JSONObject(body).getJSONObject("model_i").getJSONObject("model").getJSONArray("actors");
            JSONArray links = new JSONObject(body).getJSONObject("model_i").getJSONObject("model").getJSONArray("links");
            JSONArray dependencies = new JSONObject(body).getJSONObject("model_i").getJSONObject("model").getJSONArray("dependencies");
            istarModel.load(actors, links, dependencies);
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
