package IStarModel.Dependency;

import CommonModel.Relation;

public class ResourceDepenendecy extends Relation {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ResourceDepenendecy(String origin, String target, String name) {
        super(origin, target, "ResourceDepenendecy");
        Name = name;
    }
}
