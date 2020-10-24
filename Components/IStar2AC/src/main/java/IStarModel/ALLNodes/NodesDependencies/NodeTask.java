package IStarModel.ALLNodes.NodesDependencies;

import CommonModel.Node;

public class NodeTask extends Node {

    public NodeTask(String id, String name) {
        super(id, name, "NodeTask");
    }


    @Override
    public boolean isValid() {
        if(getId().equals("")){
            return false;
        }
        return true;
    }
}
