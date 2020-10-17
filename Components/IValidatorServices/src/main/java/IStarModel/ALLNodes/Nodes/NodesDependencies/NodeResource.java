package IStarModel.ALLNodes.Nodes.NodesDependencies;

import CommonModel.Node;

public class NodeResource extends Node{
    public NodeResource(String id, String name) {
        super(id, name, "NodeResource");
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
