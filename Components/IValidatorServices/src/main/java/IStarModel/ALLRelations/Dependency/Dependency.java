package IStarModel.ALLRelations.Dependency;

import CommonModel.Relation;

public class Dependency extends Relation {

    public Dependency(String id, String origin, String target) {
        super(id,origin, target, "GoalDependecy");
    }

    @Override
    public boolean isValid(){
        if(getOrigin() ==""){
            return false;
        }
        if(getTarget() ==""){
            return false;
        }
        return true;
    }
}
