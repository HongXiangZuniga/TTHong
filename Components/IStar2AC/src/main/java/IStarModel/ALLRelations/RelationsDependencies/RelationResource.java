package IStarModel.ALLRelations.RelationsDependencies;

import CommonModel.Relation;

public class RelationResource extends Relation {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public RelationResource(String id, String origin, String target, String text) {
        super(id, origin, target, "Resource");
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
