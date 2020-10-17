package com.tthong.Json2Model;

import com.tthong.ACModel.ACModel;
import com.tthong.ACModel.ContainerACModel;
import com.tthong.EngineServices.Project;
import com.tthong.IModel.ContainerIStarModel;
import com.tthong.IModel.IStarModel;
import com.tthong.OOMModel.ContainerOOMModel;
import com.tthong.OOMModel.OOMModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json2Model {

    //Istar Model
    public IStarModel Json2SubIModel(JSONObject model) throws JSONException {
        JSONArray actors = model.getJSONArray("actors");
        JSONArray dependencies = model.getJSONArray("dependencies");
        JSONArray links = model.getJSONArray("links");
        return new IStarModel(actors,dependencies,links);
    }
    //Todo lo asociado a IstarModel
    public ContainerIStarModel Json2IModel(JSONObject JsonIModel) throws JSONException {
        JsonArray2ArrayList js2array = new JsonArray2ArrayList();
        String date = JsonIModel.getString("date");
        JSONArray validator = JsonIModel.getJSONArray("validator");
        IStarModel subIModel = Json2SubIModel(JsonIModel.getJSONObject("model"));
        return new ContainerIStarModel(date, js2array.Js2Array(validator),subIModel);
    }


    //Todo lo asociado al AC Model
    public ContainerACModel Json2ACModel (JSONObject JsonACModel)throws JSONException {
        JsonArray2ArrayList js2array = new JsonArray2ArrayList();
        String date = JsonACModel.getString("date");
        JSONArray validator = JsonACModel.getJSONArray("validator");
        ACModel acModel = new ACModel();
        return new ContainerACModel(date,js2array.Js2Array(validator),acModel);
    }


    public ContainerOOMModel Json2OOModel (JSONObject JsonACModel)throws JSONException {
        JsonArray2ArrayList js2array = new JsonArray2ArrayList();
        String date = JsonACModel.getString("date");
        JSONArray validator = JsonACModel.getJSONArray("validator");
        OOMModel oomModel = new OOMModel();
        return new ContainerOOMModel(date,js2array.Js2Array(validator),oomModel);
    }

    public Project transform(JSONObject JsonBody) throws JSONException {
        ContainerIStarModel iModel = Json2IModel(JsonBody.getJSONObject("model_i"));
        ContainerACModel ACModel = Json2ACModel(JsonBody.getJSONObject("model_AC"));
        ContainerOOMModel OOModel = Json2OOModel(JsonBody.getJSONObject("model_OOM"));
        return new Project(JsonBody.getString("id"),iModel,ACModel,OOModel);
    }


}

