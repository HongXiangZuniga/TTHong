package IStarModel.ALLNodes.Nodes.NodesDependencies;


import CommonModel.Node;

public class NodeGoal extends Node {

    public NodeGoal(String id, String name) {
        super(id, name, "NodeGoal");
    }
    public boolean isValid(){
        try{
            if(getId() ==""){
                return false;
            }
            return true;
        }catch(Exception e){

            return false;
        }

    }
}
