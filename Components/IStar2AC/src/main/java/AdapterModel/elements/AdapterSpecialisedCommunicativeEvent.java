package AdapterModel.elements;

import ACModel.elements.CommunicativeEvent;
import ACModel.elements.SpecialisedCommunicativeEvent;
import Adapter.ToolIDSupport;
import AdapterModel.elements.subElements.InternalCommunicativeEvent;
import AdapterModel.elements.subElements.SupportActor;

import java.util.ArrayList;

public class AdapterSpecialisedCommunicativeEvent {
    private String unique;
    private String identifier;
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
    private ArrayList<SupportActor> supportActor;
    private ArrayList<InternalCommunicativeEvent> internalCommunicativeEvent = new ArrayList<>();
    private int x;
    private int y;

    public ArrayList<SupportActor> getSupportActor() {
        return supportActor;
    }

    public void setSupportActor(ArrayList<SupportActor> supportActor) {
        this.supportActor = supportActor;
    }

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


    public ArrayList<InternalCommunicativeEvent> getInternalCommunicativeEvent() {
        return internalCommunicativeEvent;
    }

    public void setInternalCommunicativeEvent(ArrayList<InternalCommunicativeEvent> internalCommunicativeEvent) {
        this.internalCommunicativeEvent = internalCommunicativeEvent;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public AdapterSpecialisedCommunicativeEvent(SpecialisedCommunicativeEvent specialisedCommunicativeEvent,int x, int y) {
        ToolIDSupport td = new ToolIDSupport();
        ArrayList<SupportActor> aux = new ArrayList<>();
        this.unique = specialisedCommunicativeEvent.getIdSistema();
        this.identifier = specialisedCommunicativeEvent.getIdUsuario();
        this.name = specialisedCommunicativeEvent.getName();
        this.type = "Specialised Communicative Event";
        this.goals = specialisedCommunicativeEvent.getGoals();
        this.description = specialisedCommunicativeEvent.getDescription();
        this.channel = specialisedCommunicativeEvent.getChannel();
        this.temporalRestrictions = specialisedCommunicativeEvent.getTemporalRestrictions();
        this.frequency = specialisedCommunicativeEvent.getFrequency();
        this.contexConstraints = specialisedCommunicativeEvent.getContexConstraints();
        this.structuralConstraints = specialisedCommunicativeEvent.getStructuralConstraints();
        this.treatment = specialisedCommunicativeEvent.getTreatment();
        this.linkedCommunication =specialisedCommunicativeEvent.getLinkedCommunication();
        this.linkedReaction = specialisedCommunicativeEvent.getLinkedCommunication();
        for(int i=0;i<specialisedCommunicativeEvent.getInternalCommunicativeEvent().size();i++){
                this.internalCommunicativeEvent.add(new InternalCommunicativeEvent(specialisedCommunicativeEvent.getInternalCommunicativeEvent().get(i)));
        }
        aux.add(new SupportActor("","","",""));
        this.supportActor = aux;
        this.x = x;
        this.y = y;
    }
}
