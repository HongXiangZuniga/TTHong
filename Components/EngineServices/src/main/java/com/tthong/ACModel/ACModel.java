package com.tthong.ACModel;

public class ACModel {
    public ArrayList<String> actors;
    public ArrayList<String> communicativeEvents;
    public ArrayList<String> specialisedCommunicativeEvents;
    public ArrayList<String> communicativeInteractions;
    public ArrayList<String> precedenceRelations;



    public ACModel() {
        this.actors = new ArrayList<String>();
        this.communicativeEvents = new ArrayList<String>();
        this.specialisedCommunicativeEvents = new ArrayList<String>();
        this.communicativeInteractions = new ArrayList<String>();
        this.precedenceRelations = new ArrayList<String>();
    }
    public ACModel(JSONArray e1, JSONArray e2, JSONArray e3,JSONArray e4,JSONArray e5) throws JSONException {
        JsonArray2ArrayList Js2Array = new JsonArray2ArrayList();

        this.actors = Js2Array.Js2Array(e1);
        this.communicativeEvents = Js2Array.Js2Array(e2);
        this.specialisedCommunicativeEvents = Js2Array.Js2Array(e3);
        this.communicativeInteractions = Js2Array.Js2Array(e4);
        this.precedenceRelations = Js2Array.Js2Array(e5);
    }

}
