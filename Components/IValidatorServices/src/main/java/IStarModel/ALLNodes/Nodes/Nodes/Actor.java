package IStarModel.ALLNodes.Nodes.Nodes;

import CommonModel.Node;
import IStarModel.IstarModel;
import org.json.JSONArray;

public class Actor extends Node {
    public JSONArray Nodes;
    public IstarModel subModel = new IstarModel();
    public Actor(String id, String name,JSONArray nd ) {
        super(id, name, "Actor");
        this.Nodes = nd;
    }
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
