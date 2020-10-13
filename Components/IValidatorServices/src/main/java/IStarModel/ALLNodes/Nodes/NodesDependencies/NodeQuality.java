package IStarModel.ALLNodes.Nodes.NodesDependencies;

import CommonModel.Node;


public class NodeQuality extends Node{
    public NodeQuality(String id, String name) {
        super(id, name, "NodeQuality");
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