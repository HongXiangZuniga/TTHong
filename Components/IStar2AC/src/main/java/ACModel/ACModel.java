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

    public ACModel() {
        this.actors = new ArrayList<>();
        this.communicativeEvents = new ArrayList<>();
        this.specialisedCommunicativeEvents = new ArrayList<>();
        this.communicativeInteractions = new ArrayList<>();
        this.precedenceRelations = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ACModel{" +
                "actors=" + actors +
                ", communicativeEvents=" + communicativeEvents +
                ", specialisedCommunicativeEvents=" + specialisedCommunicativeEvents +
                ", communicativeInteractions=" + communicativeInteractions +
                ", precedenceRelations=" + precedenceRelations +
                '}';
    }

    public void view(){
        System.out.println("ACTORS:");
        for(int i =0;i<getActors().size();i++){
           System.out.println(getActors().get(i).toString());
        }
        System.out.println("Comunicative Events:");
        for(int i =0;i<getCommunicativeEvents().size();i++){
            System.out.println(getCommunicativeEvents().get(i).toString());
        }
        System.out.println("Comunicative Interactions:");
        for(int i=0;i<getCommunicativeInteractions().size();i++){
            System.out.println(getCommunicativeInteractions().get(i).toString());
        }
        System.out.println("getPrecedence Relations:");
        for(int i =0;i<getPrecedenceRelations().size();i++){
            System.out.println((getPrecedenceRelations().get(i).toString()));
        }
        System.out.println("getSpecialised Communicative Events:");
        for(int i =0;i<getSpecialisedCommunicativeEvents().size();i++){
            System.out.println((getSpecialisedCommunicativeEvents().get(i).toString()));
        }
    }
}


