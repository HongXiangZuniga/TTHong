package com.tthong.Json2Model;

import com.tthong.EngineServices.Project;
import com.tthong.IModel.ContainerIStarModel;
import com.tthong.IModel.IStarModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json2Model {

    public IStarModel Json2SubIModel(JSONObject model) throws JSONException {
        JSONArray actors = model.getJSONArray("actors");
        JSONArray dependencies = model.getJSONArray("dependencies");
        JSONArray links = model.getJSONArray("links");
        return new IStarModel(actors,dependencies,links);
    }



    public ContainerIStarModel Json2IModel(JSONObject JsonIModel) throws JSONException {
        JsonArray2ArrayList js2array = new JsonArray2ArrayList();
        String date = JsonIModel.getString("date");
        JSONArray validator = JsonIModel.getJSONArray("validator");
        IStarModel subIModel = Json2SubIModel(JsonIModel.getJSONObject("model"));
        return new ContainerIStarModel(date, js2array.Js2Array(validator),subIModel);
    }


    public Project transform(JSONObject JsonBody) throws JSONException {
        ContainerIStarModel iModel = Json2IModel(JsonBody.getJSONObject("IModel"));
        return new Project(JsonBody.getString("id"),iModel);
    }




}

