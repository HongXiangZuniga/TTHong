package AdapterModel.elements;

import ACModel.elements.CommunicativeInteraction;
import AdapterModel.elements.subElements.AdapterMessageStructure;

import java.util.ArrayList;

public class AdapterCommunicativeInteraction {
    private String unique;
    private String identifier;
    private String name;
    private String type;
    private String source;
    private String target;
    private AdapterMessageStructure MessageStructure;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public AdapterMessageStructure getMessageStructure() {
        return MessageStructure;
    }

    public void setMessageStructure(AdapterMessageStructure messageStructure) {
        this.MessageStructure = messageStructure;
    }

    public AdapterCommunicativeInteraction(CommunicativeInteraction communicativeInteraction) {
        this.unique = communicativeInteraction.getIdSistem();
        this.identifier = communicativeInteraction.getIdUser();
        this.name = communicativeInteraction.getName();
        this.type = "Communicative Interaction";
        this.source = communicativeInteraction.getSource();
        this.target = communicativeInteraction.getTarget();
        ArrayList<String> aux = new ArrayList<>();
        this.MessageStructure = new AdapterMessageStructure(

                communicativeInteraction.getMessageStructure().getName(),
                communicativeInteraction.getMessageStructure().getType(),
                communicativeInteraction.getMessageStructure().getChildren()

        );
    }
}
