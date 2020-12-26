package OOMModel;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.util.ArrayList;

public class containerOOM {
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
    public containerOOM() {
        this.validator = new JSONArray();
        this.model = new JSONObject();
    }
}
