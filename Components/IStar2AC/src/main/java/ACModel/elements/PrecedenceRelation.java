package ACModel.elements;

import ACModel.elements.subElements.MessageStructure;

public class PrecedenceRelation {
    private String idSistem;
    private String type;
    private String source;
    private String target;

    public String getIdSistem() {
        return idSistem;
    }

    public void setIdSistem(String idSistem) {
        this.idSistem = idSistem;
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

    public PrecedenceRelation(String idSistem, String type, String source, String target) {
        this.idSistem = idSistem;
        this.type = type;
        this.source = source;
        this.target = target;
    }
}
