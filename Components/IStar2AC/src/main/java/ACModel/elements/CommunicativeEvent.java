package ACModel.elements;

import java.util.ArrayList;

public class CommunicativeEvent {
    private String idSistem;
    private String idUser;
    private String name;
    private String type;
    private String description;
    private String chanel;
    private String temporalRestrictions;
    private String frequency;
    private String contextConstraints;
    private String treatment;
    private String linkedCommunication;
    private String linkedReaction;
    private Actor supportActor;

    public String getIdSistem() {
        return idSistem;
    }

    public void setIdSistem(String idSistem) {
        this.idSistem = idSistem;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public Actor getSupportActor() {
        return supportActor;
    }

    public void setSupportActor(Actor supportActor) {
        this.supportActor = supportActor;
    }

    public CommunicativeEvent(String idSistem, String idUser, String name, String type, String description, String chanel, String temporalRestrictions, String frequency, String contextConstraints, String treatment, String linkedCommunication, String linkedReaction, Actor supportActor) {
        this.idSistem = idSistem;
        this.idUser = idUser;
        this.name = name;
        this.type = type;
        this.description = description;
        this.chanel = chanel;
        this.temporalRestrictions = temporalRestrictions;
        this.frequency = frequency;
        this.contextConstraints = contextConstraints;
        this.treatment = treatment;
        this.linkedCommunication = linkedCommunication;
        this.linkedReaction = linkedReaction;
        this.supportActor = supportActor;
    }
}
