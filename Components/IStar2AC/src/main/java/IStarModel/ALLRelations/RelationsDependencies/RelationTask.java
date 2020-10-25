package IStarModel.ALLRelations.RelationsDependencies;

import CommonModel.Relation;

public class RelationTask extends Relation {
    private String text;

    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public RelationTask(String id, String origin, String target, String text) {
        super(id, origin, target,"task");
        this.text=text;
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
