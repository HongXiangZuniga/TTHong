package IStarModel.ALLRelations.ActorLinks;

import CommonModel.Relation;

public class ParticipatesInLink extends Relation {


    public ParticipatesInLink(String id,String origin, String target) {
        super(id,origin, target, "ParticipatesInLink");
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
