package com.tthong.IModel;

import com.tthong.Json2Model.JsonArray2ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class IStarModel {

    public ArrayList<String> actors;
    public ArrayList<String> dependencies;
    public ArrayList<String> links;



    public IStarModel() {
        this.actors = new ArrayList<String>();
        this.dependencies = new ArrayList<String>();
        this.links = new ArrayList<String>();
    }



    public IStarModel(JSONArray actors, JSONArray dependencies, JSONArray links) throws JSONException {
        JsonArray2ArrayList Js2Array = new JsonArray2ArrayList();

        this.actors = Js2Array.Js2Array(actors);
        this.dependencies = Js2Array.Js2Array(dependencies);
        this.links = Js2Array.Js2Array(links);
    }
}
