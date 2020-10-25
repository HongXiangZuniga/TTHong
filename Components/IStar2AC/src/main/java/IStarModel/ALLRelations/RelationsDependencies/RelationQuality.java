package IStarModel.ALLRelations.RelationsDependencies;

import CommonModel.Relation;


public class RelationQuality extends Relation {
    private String text;

    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public RelationQuality(String id, String origin, String target, String text) {
        super(id, origin, target, "Quality");
        this.text = text;
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
