package IStarModel.ALLNodes.Nodes.Nodes;

import CommonModel.Node;
import IStarModel.IstarModel;
import org.json.JSONArray;

public class Role extends Node {
    public JSONArray Nodes;
    public IstarModel subModel = new IstarModel();

    public Role(String id, String name,JSONArray nd) {
        super(id, name, "Role");
        this.Nodes = nd;
    }
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
