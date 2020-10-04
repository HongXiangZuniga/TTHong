package IStarModel.ActorLinks;

import CommonModel.Relation;

public class ParticipatesInLink extends Relation {


    public ParticipatesInLink(String id,String origin, String target) {
        super(id,origin, target, "ParticipatesInLink");
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
