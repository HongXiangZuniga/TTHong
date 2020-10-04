package IStarModel.ALLNodes.Nodes.Nodes;

import CommonModel.Node;
import IStarModel.IstarModel;
import org.json.JSONArray;

public class Agent extends Node {
    public IstarModel subModel = new IstarModel();
    public JSONArray Nodes;

    public Agent(String id, String name,JSONArray nd) {
        super(id, name, "Agent");
        this.Nodes = nd;
    }
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
