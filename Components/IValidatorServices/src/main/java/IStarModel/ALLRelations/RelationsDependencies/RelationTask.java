package IStarModel.ALLRelations.RelationsDependencies;

import CommonModel.Relation;

public class RelationTask extends Relation {
    public RelationTask(String id, String origin, String target) {
        super(id, origin, target,"task");
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
