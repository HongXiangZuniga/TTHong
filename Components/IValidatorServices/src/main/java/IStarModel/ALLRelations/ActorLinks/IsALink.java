package IStarModel.ALLRelations.ActorLinks;

import CommonModel.Relation;

public class IsALink extends Relation {

    public IsALink(String id,String origin, String target) {
        super(id,origin, target,"IsALink");
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
