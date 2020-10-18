package IStarModel.ALLRelations.Relations;

import CommonModel.Relation;

public class NeededBy extends Relation {

    public NeededBy(String id,String origin, String target) {
        super(id,origin, target, "NeededBy");
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
