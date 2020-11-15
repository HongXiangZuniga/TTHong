package AdapterModel;

import AdapterModel.elements.*;

import java.util.ArrayList;

public class AdapterACModel {
    private ArrayList<AdapterActor> Actors;
    private ArrayList<AdapterCommunicativeEvent> communicativeEvents;
    private ArrayList<AdapterSpecialisedCommunicativeEvent> specialisedCommunicativeEvents;
    private ArrayList<AdapterCommunicativeInteraction> communicativeInteractions;
    private ArrayList<AdapterPrecedenceRelation> precedenceRelations;
    private ArrayList<ArrayList<String>> trazability;

    public ArrayList<AdapterActor> getActors() {
        return Actors;
    }

    public ArrayList<ArrayList<String>> getTrazability() {
        return trazability;
    }

    public void setActors(ArrayList<AdapterActor> actors) {
        Actors = actors;
    }

    public ArrayList<AdapterCommunicativeEvent> getCommunicativeEvents() {
        return communicativeEvents;
    }

    public void setCommunicativeEvents(ArrayList<AdapterCommunicativeEvent> communicativeEvents) {
        this.communicativeEvents = communicativeEvents;
    }

    public ArrayList<AdapterSpecialisedCommunicativeEvent> getSpecialisedCommunicativeEvents() {
        return specialisedCommunicativeEvents;
    }

    public void setSpecialisedCommunicativeEvents(ArrayList<AdapterSpecialisedCommunicativeEvent> specialisedCommunicativeEvents) {
        this.specialisedCommunicativeEvents = specialisedCommunicativeEvents;
    }

    public ArrayList<AdapterCommunicativeInteraction> getCommunicativeInteractions() {
        return communicativeInteractions;
    }

    public void setCommunicativeInteractions(ArrayList<AdapterCommunicativeInteraction> communicativeInteractions) {
        this.communicativeInteractions = communicativeInteractions;
    }

    public ArrayList<AdapterPrecedenceRelation> getPrecedenceRelations() {
        return precedenceRelations;
    }

    public void setPrecedenceRelations(ArrayList<AdapterPrecedenceRelation> precedenceRelations) {
        this.precedenceRelations = precedenceRelations;
    }

    /*public ArrayList<ArrayList<String>> getTrazability() {
        return trazability;
    }
*/
    public void setTrazability(ArrayList<ArrayList<String>> trazability) {
        this.trazability = trazability;
    }

    public AdapterACModel() {
        this.Actors = new ArrayList<>();
        this.communicativeEvents = new ArrayList<>();
        this.specialisedCommunicativeEvents = new ArrayList<>();
        this.communicativeInteractions = new ArrayList<>();
        this.precedenceRelations = new ArrayList<>();
        this.trazability = new ArrayList<>();
    }
}


