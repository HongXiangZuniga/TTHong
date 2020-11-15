package AdapterModel.elements;

import ACModel.elements.Actor;

public class AdapterActor {
    private String unique;
    private String identifier;
    private String name;
    private String type;
    private int x;
    private int y;

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String idUser) {
        this.identifier = idUser;
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

    public AdapterActor(Actor actor, int x , int y) {
        this.unique = actor.getIdSistem();
        this.identifier = actor.getIdUser();
        this.name = actor.getName();
        this.type = actor.getType();
        this.x = x;
        this.y = y;
    }
}

