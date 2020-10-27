package ACModel.elements;

import ACModel.elements.subElements.MessageStructure;

public class CommunicativeInteraction {
    private String idSistem;
    private String idUser;
    private String name;
    private String type;
    private String source;
    private String target;
    private MessageStructure messageStructure;

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

    public MessageStructure getMessageStructure() {
        return messageStructure;
    }

    public void setMessageStructure(MessageStructure messageStructure) {
        this.messageStructure = messageStructure;
    }

    public CommunicativeInteraction(String idSistem, String idUser, String name, String type, String source, String target, MessageStructure messageStructure) {
        this.idSistem = idSistem;
        this.idUser = idUser;
        this.name = name;
        this.type = type;
        this.source = source;
        this.target = target;
        this.messageStructure = messageStructure;
    }

    @Override
    public String toString() {
        return "CommunicativeInteraction{" +
                "idSistem='" + idSistem + '\'' +
                ", idUser='" + idUser + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", source='" + source + '\'' +
                ", target='" + target + '\'' +
                ", messageStructure=" + messageStructure +
                '}';
    }
}
