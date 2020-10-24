package IStarModel.ALLRelations.Relations;

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
