package IStarModel.ALLNodes.Nodes;

import CommonModel.Node;
import IStarModel.IstarModel;

public class Role extends Node {
    public IstarModel subModel = new IstarModel();

    public Role(String id, String name) {
        super(id, name, "Role");
    }

    @Override
    public boolean isValid(){
        if(getName() ==""){
            return false;
        }
        return true;
    }
}
