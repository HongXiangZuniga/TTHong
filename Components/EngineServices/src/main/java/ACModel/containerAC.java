package IModel;

import net.minidev.json.JSONObject;


import java.util.ArrayList;

public class containerI {
    private ArrayList<ArrayList<String>> validator;
    private JSONObject model_i;


    public ArrayList<ArrayList<String>> getValidator() {
        return validator;
    }

    public void setValidator(ArrayList<ArrayList<String>> validator) {
        this.validator = validator;
    }

    public JSONObject getModel_i() {
        return model_i;
    }

    public void setModel_i(JSONObject model_i) {
        this.model_i = model_i;
    }

    public containerI() {
        this.model_i = new JSONObject();
    }
}
