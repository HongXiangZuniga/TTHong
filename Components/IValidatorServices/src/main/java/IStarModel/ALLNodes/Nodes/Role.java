package IStarModel.ALLNodes.Nodes;

import CommonModel.Node;
import IStarModel.IstarModel;
import org.json.JSONArray;

public class Role extends Node {
    public JSONArray Nodes;
    public IstarModel subModel = new IstarModel();

    public Role(String id, String name,JSONArray nd) {
        super(id, name, "Role");
        this.Nodes = nd;
        subModel.loadActors(nd);
    }
    public Role(String id, String name) {
        super(id, name, "Role");
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

    @Override
    public boolean isValid() {
        if(getId().equals("")){
            return false;
        }
        return true;
    }

}
