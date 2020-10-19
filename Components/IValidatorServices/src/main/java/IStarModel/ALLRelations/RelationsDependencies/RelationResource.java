package IStarModel.ALLRelations.RelationsDependencies;

import CommonModel.Relation;

public class RelationResource extends Relation {

    public RelationResource(String id, String origin, String target) {
        super(id, origin, target, "Resource");
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
