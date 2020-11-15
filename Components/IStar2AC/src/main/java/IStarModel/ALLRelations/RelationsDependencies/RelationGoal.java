package IStarModel.ALLRelations.RelationsDependencies;


import CommonModel.Relation;

public class RelationGoal extends Relation {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public RelationGoal(String id, String origin, String target, String text) {
        super(id, origin, target, "Goal");
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
