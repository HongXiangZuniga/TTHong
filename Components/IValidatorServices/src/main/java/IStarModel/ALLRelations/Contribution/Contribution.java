package IStarModel.Contribution;

import CommonModel.Relation;

public class Contribution extends Relation {

    public Contribution(String id, String origin, String target) {
        super(id,origin, target, "Break");
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
