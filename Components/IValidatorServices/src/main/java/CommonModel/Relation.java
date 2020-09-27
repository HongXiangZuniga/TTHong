package CommonModel;

public class Relation {
    private String Origin;
    private String Target;
    private String Type;

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getTarget() {
        return Target;
    }

    public void setTarget(String target) {
        Target = target;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Relation(String origin, String target, String type) {
        Origin = origin;
        Target = target;
        Type = type;
    }
}


