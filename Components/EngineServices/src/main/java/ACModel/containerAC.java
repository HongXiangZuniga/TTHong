package ACModel;

import net.minidev.json.JSONObject;
import java.util.ArrayList;

public class containerAC {
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

    public containerAC() {
        this.validator = new ArrayList<>();
        this.model = new JSONObject();
        JSONObject[] actors = new JSONObject[]{};
        JSONObject[] communicativeEvents = new JSONObject[]{};
        JSONObject[] specialisedCommunicativeEvents = new JSONObject[]{};
        JSONObject[] communicativeInteractions = new JSONObject[]{};
        JSONObject[] precedenceRelations = new JSONObject[]{};
        JSONObject[] trazability = new JSONObject[]{};

        this.model.appendField("actors",actors);
        this.model.appendField("communicativeEvents",communicativeEvents);
        this.model.appendField("specialisedCommunicativeEvents",specialisedCommunicativeEvents);
        this.model.appendField("communicativeInteractions",communicativeInteractions);
        this.model.appendField("precedenceRelations",precedenceRelations);
        this.model.appendField("trazability",trazability);
    }
}
