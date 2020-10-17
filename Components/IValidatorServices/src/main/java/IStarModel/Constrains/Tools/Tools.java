package IStarModel.Constrains.Tools;

import CommonModel.Node;
import IStarModel.ALLNodes.Nodes.Nodes.Actor;
import IStarModel.ALLNodes.Nodes.Nodes.Agent;
import IStarModel.ALLNodes.Nodes.Nodes.Role;

import java.util.ArrayList;

public class Tools {

    public String typeof(String id, ArrayList<Node> Nodes){
        for(int i=0;i<Nodes.size();i++){
            if(Nodes.get(i).getId().equals(id)){
                /*System.out.println("match");*/
                return Nodes.get(i).getType();
            }
        }
        return "";
    }

}
