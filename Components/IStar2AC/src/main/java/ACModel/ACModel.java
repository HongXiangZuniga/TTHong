package ACModel;

import ACModel.elements.*;

import java.util.ArrayList;

public class ACModel {
    private ArrayList<Actor> actors;
    private ArrayList<CommunicativeEvent> communicativeEvents;
    private ArrayList<SpecialisedCommunicativeEvent> specialisedCommunicativeEvents;
    private ArrayList<CommunicativeInteraction> communicativeInteractions;
    private ArrayList<PrecedenceRelation> precedenceRelations;

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public ArrayList<CommunicativeEvent> getCommunicativeEvents() {
        return communicativeEvents;
    }

    public void setCommunicativeEvents(ArrayList<CommunicativeEvent> communicativeEvents) {
        this.communicativeEvents = communicativeEvents;
    }

    public ArrayList<SpecialisedCommunicativeEvent> getSpecialisedCommunicativeEvents() {
        return specialisedCommunicativeEvents;
    }

    public void setSpecialisedCommunicativeEvents(ArrayList<SpecialisedCommunicativeEvent> specialisedCommunicativeEvents) {
        this.specialisedCommunicativeEvents = specialisedCommunicativeEvents;
    }

    public ArrayList<CommunicativeInteraction> getCommunicativeInteractions() {
        return communicativeInteractions;
    }

    public void setCommunicativeInteractions(ArrayList<CommunicativeInteraction> communicativeInteractions) {
        this.communicativeInteractions = communicativeInteractions;
    }

    public ArrayList<PrecedenceRelation> getPrecedenceRelations() {
        return precedenceRelations;
    }

    public void setPrecedenceRelations(ArrayList<PrecedenceRelation> precedenceRelations) {
        this.precedenceRelations = precedenceRelations;
    }

    public ACModel(ArrayList<Actor> actors, ArrayList<CommunicativeEvent> communicativeEvents, ArrayList<SpecialisedCommunicativeEvent> specialisedCommunicativeEvents, ArrayList<CommunicativeInteraction> communicativeInteractions, ArrayList<PrecedenceRelation> precedenceRelations) {
        this.actors = actors;
        this.communicativeEvents = communicativeEvents;
        this.specialisedCommunicativeEvents = specialisedCommunicativeEvents;
        this.communicativeInteractions = communicativeInteractions;
        this.precedenceRelations = precedenceRelations;
    }
}


