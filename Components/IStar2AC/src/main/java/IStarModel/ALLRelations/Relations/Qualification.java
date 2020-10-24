package IStarModel.ALLRelations.Relations;

import CommonModel.Relation;

public class Qualification extends Relation {

    public Qualification(String id,String origin, String target) {
        super(id,origin, target, "Qualification");
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
