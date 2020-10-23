package IStarModel.ALLNodes.Nodes.NodesDependencies;


import CommonModel.Node;

public class NodeGoal extends Node {

    public NodeGoal(String id, String name) {
        super(id, name, "NodeGoal");
    }
    @Override
    public boolean isValid() {
        if(getId().equals("")){
            return false;
        }
        return true;
    }
}
