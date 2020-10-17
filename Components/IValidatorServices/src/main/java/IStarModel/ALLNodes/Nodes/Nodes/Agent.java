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
        subModel.loadActors(nd);
    }
    public Agent(String id, String name) {
        super(id, name, "Agent");
    }

    public String contain(String id){
        if(Nodes.length()!=0){
            for(int i =0;i<subModel.Nodes.size();i++){
                if(id.equals(subModel.Nodes.get(0).getId())){
                    return subModel.Nodes.get(0).getType();
                }
            }
        }
        return "";
    }
}
