package IModel;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import java.util.ArrayList;

public class containerI {
    private JSONArray validator;
    private JSONObject model;


    public JSONArray getValidator() {
        return validator;
    }

    public void setValidator(JSONArray validator) {
        this.validator = validator;
    }

    public JSONObject getModel() {
        return model;
    }

    public void setModel(JSONObject model) {
        this.model = model;
    }

    public containerI() {
        this.validator = new JSONArray();
        this.model = new JSONObject();
        JSONArray actors = new JSONArray();
        JSONArray dependencies = new JSONArray();
        JSONArray links =new JSONArray();
        this.model.appendField("actors",actors);
        this.model.appendField("dependencies",dependencies);
        this.model.appendField("links",links);
    }
}
