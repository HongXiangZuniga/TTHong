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

}
