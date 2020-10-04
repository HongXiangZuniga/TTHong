package IStarModel.ALLRelations.Contribution;

import CommonModel.Relation;

public class Contribution extends Relation {
    private String subtipo;

    public String getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(String subtipo) {
        this.subtipo = subtipo;
    }

    public Contribution(String id, String origin, String target,String st) {
        super(id,origin, target, "Contribution");
        this.subtipo = st;
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
