package IStarModel.ALLNodes.Nodes.NodesDependencies;

import CommonModel.Node;

public class NodeResource extends Node{
    public NodeResource(String id, String name) {
        super(id, name, "NodeResource");
    }

    @Override
    public boolean isValid() {
        if(getId().equals("")){
            return false;
        }
        return true;
    }
}
