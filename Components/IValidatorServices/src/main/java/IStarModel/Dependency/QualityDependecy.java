package IStarModel.Dependency;

import CommonModel.Relation;

public class QualityDependecy  extends Relation {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public QualityDependecy(String origin, String target, String name) {
        super(origin, target, "QualityDependecy");
        Name = name;
    }
}
