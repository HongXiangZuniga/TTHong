package IStarModel.Dependency;

import CommonModel.Relation;
import IStarModel.Nodes.Role;

public class GoalDependecy extends Relation {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public GoalDependecy(String origin, String target,  String name) {
        super(origin, target, "GoalDependecy");
        Name = name;
    }
}
