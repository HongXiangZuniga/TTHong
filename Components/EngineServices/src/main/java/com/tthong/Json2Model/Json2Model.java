package com.tthong.Json2Model;

import com.tthong.EngineServices.Model;
import com.tthong.IModel.IModel;
import com.tthong.IModel.SubIModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json2Model {

    public SubIModel Json2SubIModel(JSONObject model) throws JSONException {
        JSONArray actors = model.getJSONArray("actors");
        JSONArray dependencies = model.getJSONArray("dependencies");
        JSONArray links = model.getJSONArray("links");
        return new SubIModel(actors,dependencies,links);
    }



    public IModel Json2IModel(JSONObject JsonIModel) throws JSONException {
        JsonArray2ArrayList js2array = new JsonArray2ArrayList();
        String date = JsonIModel.getString("date");
        JSONArray validator = JsonIModel.getJSONArray("validator");
        SubIModel subIModel = Json2SubIModel(JsonIModel.getJSONObject("model"));
        return new IModel(date, js2array.Js2Array(validator),subIModel);
    }


    public Model transform(JSONObject JsonBody) throws JSONException {
        IModel iModel = Json2IModel(JsonBody.getJSONObject("IModel"));
        return new Model(JsonBody.getString("id"),iModel);
    }




}

