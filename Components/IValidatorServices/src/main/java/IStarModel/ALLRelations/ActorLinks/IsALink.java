package IStarModel.ActorLinks;

import CommonModel.Relation;

public class IsALink extends Relation {

    public IsALink(String id,String origin, String target) {
        super(id,origin, target,"IsALink");
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
