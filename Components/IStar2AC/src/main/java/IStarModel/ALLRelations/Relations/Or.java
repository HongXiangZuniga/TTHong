package IStarModel.ALLRelations.Relations;

import CommonModel.Relation;

public class Or  extends Relation {

    public Or(String id,String origin, String target) {
        super(id,origin, target, "Or");
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
