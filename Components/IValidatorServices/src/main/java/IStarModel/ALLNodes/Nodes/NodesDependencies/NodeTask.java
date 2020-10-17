package IStarModel.ALLNodes.Nodes.NodesDependencies;

import CommonModel.Node;

public class NodeTask extends Node {

    public NodeTask(String id, String name) {
        super(id, name, "NodeTask");
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
