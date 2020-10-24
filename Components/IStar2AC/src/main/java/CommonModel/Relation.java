package CommonModel;

public class Relation {
    private String Id;
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

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Relation(String id, String origin, String target, String type) {
        Id=id;
        Origin = origin;
        Target = target;
        Type = type;
    }

    public boolean isValid(){
        return true;
    }
}


