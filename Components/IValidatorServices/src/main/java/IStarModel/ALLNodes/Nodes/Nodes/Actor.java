package IStarModel.ALLNodes.Nodes;

import CommonModel.Node;
import IStarModel.IstarModel;

public class Actor extends Node {
    public IstarModel subModel = new IstarModel();
    public Actor(String id, String name ) {
        super(id, name, "Actor");
    }

    @Override
    public boolean isValid(){
        if(getName() ==""){
            return false;
        }
        return true;
    }

}
