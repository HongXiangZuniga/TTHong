package ACModel;

import net.minidev.json.JSONObject;
import net.minidev.json.JSONArray;
import java.time.LocalDate;

public class containerAC {
    private JSONArray validator;
    private JSONObject model;
    private LocalDate lastModification;

    public LocalDate getLastModification() {
        return lastModification;
    }

    public void setLastModification(LocalDate lastModification) {
        this.lastModification = lastModification;
    }

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

    public containerAC() {
        this.validator = new JSONArray();
        this.model = new JSONObject();
        JSONArray actors = new JSONArray();
        JSONArray communicativeEvents = new JSONArray();
        JSONArray specialisedCommunicativeEvents =new JSONArray();
        JSONArray communicativeInteractions = new JSONArray();
        JSONArray precedenceRelations = new JSONArray();
        JSONArray trazability = new JSONArray();

        this.model.appendField("actors",actors);
        this.model.appendField("communicativeEvents",communicativeEvents);
        this.model.appendField("specialisedCommunicativeEvents",specialisedCommunicativeEvents);
        this.model.appendField("communicativeInteractions",communicativeInteractions);
        this.model.appendField("precedenceRelations",precedenceRelations);
        this.model.appendField("trazability",trazability);
        this.lastModification= LocalDate.now();
    }
}
