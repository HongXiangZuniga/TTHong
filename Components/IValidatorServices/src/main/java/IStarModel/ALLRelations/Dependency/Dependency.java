package IStarModel.ALLRelations.Dependency;

import CommonModel.Relation;

public class Dependency extends Relation {

    public Dependency(String id, String origin, String target) {
        super(id,origin, target, "GoalDependecy");
    }

}
