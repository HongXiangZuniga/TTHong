package IStarModel.ALLRelations.RelationsDependencies;

import CommonModel.Relation;


public class RelationQuality extends Relation {


    public RelationQuality(String id, String origin, String target) {
        super(id, origin, target, "Quality");
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
