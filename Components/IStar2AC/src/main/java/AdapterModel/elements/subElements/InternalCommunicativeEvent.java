package AdapterModel.elements.subElements;


import ACModel.elements.CommunicativeEvent;
import Adapter.ToolIDSupport;

import java.util.ArrayList;

public class InternalCommunicativeEvent {
    private String unique;
    private String identifier;
    private String name;
    private String type;
    private String description;
    private String chanel;
    private String goals;
    private String temporalRestrictions;
    private String frequency;
    private String contextConstraints;
    private String treatment;
    private String linkedCommunication;
    private String linkedReaction;
    private ArrayList<SupportActor> supportActor;

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChanel() {
        return chanel;
    }

    public void setChanel(String chanel) {
        this.chanel = chanel;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getTemporalRestrictions() {
        return temporalRestrictions;
    }

    public void setTemporalRestrictions(String temporalRestrictions) {
        this.temporalRestrictions = temporalRestrictions;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getContextConstraints() {
        return contextConstraints;
    }

    public void setContextConstraints(String contextConstraints) {
        this.contextConstraints = contextConstraints;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getLinkedCommunication() {
        return linkedCommunication;
    }

    public void setLinkedCommunication(String linkedCommunication) {
        this.linkedCommunication = linkedCommunication;
    }

    public String getLinkedReaction() {
        return linkedReaction;
    }

    public void setLinkedReaction(String linkedReaction) {
        this.linkedReaction = linkedReaction;
    }

    public ArrayList<SupportActor> getSupportActor() {
        return supportActor;
    }

    public void setSupportActor(ArrayList<SupportActor> supportActor) {
        this.supportActor = supportActor;
    }

    public InternalCommunicativeEvent(CommunicativeEvent communicativeEvent) {
        ToolIDSupport td = new ToolIDSupport();
        ArrayList<SupportActor> aux = new ArrayList<>();
        this.unique = communicativeEvent.getIdSistem();
        this.identifier = communicativeEvent.getIdUser();
        this.name = communicativeEvent.getName();
        this.type = "Internal Communicative Event";
        this.description = communicativeEvent.getDescription();
        this.chanel = communicativeEvent.getChanel();
        this.goals = communicativeEvent.getGoals();
        this.temporalRestrictions = communicativeEvent.getTemporalRestrictions();
        this.frequency = communicativeEvent.getFrequency();
        this.contextConstraints = communicativeEvent.getContextConstraints();
        this.treatment = communicativeEvent.getTreatment();
        this.linkedCommunication = communicativeEvent.getLinkedCommunication();
        this.linkedReaction = communicativeEvent.getLinkedReaction();
        aux.add(new SupportActor(
                td.toString(),
                "",
                "",
                ""
                )
        );
        this.supportActor = aux;
    }
}
