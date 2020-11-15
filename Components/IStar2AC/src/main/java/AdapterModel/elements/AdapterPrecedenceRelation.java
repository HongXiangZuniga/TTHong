package AdapterModel.elements;

import ACModel.elements.PrecedenceRelation;

public class AdapterPrecedenceRelation {
    private String unique;
    private String type;
    private String source;
    private String target;

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public AdapterPrecedenceRelation(PrecedenceRelation precedenceRelation) {
        this.unique = precedenceRelation.getIdSistem();
        this.type = precedenceRelation.getType();
        this.source = precedenceRelation.getSource();
        this.target = precedenceRelation.getTarget();
    }
}
