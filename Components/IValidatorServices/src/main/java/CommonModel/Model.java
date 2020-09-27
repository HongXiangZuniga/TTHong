package CommonModel;

import java.util.ArrayList;

public class Model {

    private ArrayList<Node> Nodes;
    private ArrayList<Relation> Relations;

    public ArrayList<Node> getNodes() {
        return Nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        Nodes = nodes;
    }

    public ArrayList<Relation> getRelations() {
        return Relations;
    }

    public void setRelations(ArrayList<Relation> relations) {
        Relations = relations;
    }
}
