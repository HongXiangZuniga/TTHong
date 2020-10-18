package IStarModel.ALLRelations.Dependency;

import CommonModel.Relation;

public class Dependency extends Relation {

    public Dependency(String id, String origin, String target) {
        super(id,origin, target, "GoalDependecy");
    }
    //Validacion Individual
    @Override
    public boolean isValid() {
        if(getId().equals("")){
            return false;
        }
        if(getOrigin().equals("")){
            return false;
        }
        if(getTarget().equals("")){
            return false;
        }
        return true;
    }
}
