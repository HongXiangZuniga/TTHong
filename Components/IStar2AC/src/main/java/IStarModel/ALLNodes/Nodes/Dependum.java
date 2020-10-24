package IStarModel.ALLNodes.Nodes;

import CommonModel.Node;

public class Dependum extends Node {

    public Dependum(String id, String name) {
        super(id, name, "Dependum");
    }

    @Override
    public boolean isValid() {
        if(getId().equals("")){
            return false;
        }
        return true;
    }
}
