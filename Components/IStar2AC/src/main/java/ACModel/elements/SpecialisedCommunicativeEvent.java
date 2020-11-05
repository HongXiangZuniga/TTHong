package ACModel.elements;

import java.util.ArrayList;

public class SpecialisedCommunicativeEvent {
    private String idSistema;
    private String idUsuario;
    private String name;
    private String type;
    private String goals;
    private String description;
    private String channel;
    private String temporalRestrictions;
    private String frequency;
    private String contexConstraints;
    private String structuralConstraints;
    private String treatment;
    private String linkedCommunication;
    private String linkedReaction;
    private ArrayList<CommunicativeEvent> InternalCommunicativeEvent = new ArrayList<>();

    public String getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(String idSistema) {
        this.idSistema = idSistema;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
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

    public String getContexConstraints() {
        return contexConstraints;
    }

    public void setContexConstraints(String contexConstraints) {
        this.contexConstraints = contexConstraints;
    }

    public String getStructuralConstraints() {
        return structuralConstraints;
    }

    public void setStructuralConstraints(String structuralConstraints) {
        this.structuralConstraints = structuralConstraints;
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

    public ArrayList<CommunicativeEvent> getInternalCommunicativeEvent() {
        return InternalCommunicativeEvent;
    }

    public void setInternalCommunicativeEvent(ArrayList<CommunicativeEvent> internalCommunicativeEvent) {
        InternalCommunicativeEvent = internalCommunicativeEvent;
    }

    public SpecialisedCommunicativeEvent(String idSistema, String idUsuario, String name, String type, String goals, String description, String channel, String temporalRestrictions, String frequency, String contexConstraints, String structuralConstraints, String treatment, String linkedCommunication, String linkedReaction, ArrayList<CommunicativeEvent> internalCommunicativeEvent) {
        this.idSistema = idSistema;
        this.idUsuario = idUsuario;
        this.name = name;
        this.type = type;
        this.goals = goals;
        this.description = description;
        this.channel = channel;
        this.temporalRestrictions = temporalRestrictions;
        this.frequency = frequency;
        this.contexConstraints = contexConstraints;
        this.structuralConstraints = structuralConstraints;
        this.treatment = treatment;
        this.linkedCommunication = linkedCommunication;
        this.linkedReaction = linkedReaction;
        InternalCommunicativeEvent = internalCommunicativeEvent;
    }

    @Override
    public String toString() {
        return "AdapterSpecialisedCommunicativeEvent{" +
                "idSistema='" + idSistema + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", goals='" + goals + '\'' +
                ", description='" + description + '\'' +
                ", channel='" + channel + '\'' +
                ", temporalRestrictions='" + temporalRestrictions + '\'' +
                ", frequency='" + frequency + '\'' +
                ", contexConstraints='" + contexConstraints + '\'' +
                ", structuralConstraints='" + structuralConstraints + '\'' +
                ", treatment='" + treatment + '\'' +
                ", linkedCommunication='" + linkedCommunication + '\'' +
                ", linkedReaction='" + linkedReaction + '\'' +
                ", InternalCommunicativeEvent=" + InternalCommunicativeEvent +
                '}';
    }
}
