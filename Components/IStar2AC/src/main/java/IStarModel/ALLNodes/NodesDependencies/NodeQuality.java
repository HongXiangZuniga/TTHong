package IStarModel.ALLNodes.NodesDependencies;

import CommonModel.Node;


public class NodeQuality extends Node{
    public NodeQuality(String id, String name) {
        super(id, name, "NodeQuality");
    }


    @Override
    public boolean isValid() {
        if(getId().equals("")){
            return false;
        }
        return true;
    }
}