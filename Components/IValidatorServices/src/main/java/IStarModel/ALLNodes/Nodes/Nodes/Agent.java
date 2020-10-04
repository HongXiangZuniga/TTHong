package IStarModel.ALLNodes.Nodes;

import CommonModel.Node;
import IStarModel.IstarModel;

public class Agent extends Node {
    public IstarModel subModel = new IstarModel();

    public Agent(String id, String name) {
        super(id, name, "Agent");
    }

    @Override
    public boolean isValid(){
        if(getName() ==""){
            return false;
        }
        return true;
    }
}
