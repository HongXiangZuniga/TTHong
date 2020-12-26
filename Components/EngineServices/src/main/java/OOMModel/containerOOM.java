package OOMModel;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.time.LocalDate;
import java.util.ArrayList;

public class containerOOM {
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
    public containerOOM() {
        this.validator = new JSONArray();
        this.model = new JSONObject();
        this.lastModification = LocalDate.now();
    }
}
