package IModel;

import net.minidev.json.JSONObject;
import java.util.ArrayList;

public class containerI {
    private ArrayList<ArrayList<String>> validator;
    private JSONObject model;


    public ArrayList<ArrayList<String>> getValidator() {
        return validator;
    }

    public void setValidator(ArrayList<ArrayList<String>> validator) {
        this.validator = validator;
    }

    public JSONObject getModel() {
        return model;
    }

    public void setModel(JSONObject model) {
        this.model = model;
    }

    public containerI() {
        this.model = new JSONObject();
    }
}
