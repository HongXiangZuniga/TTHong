package Tools;

import ACModel.ACModel;
import ACModel.elements.Actor;
import CommonModel.Node;
import CommonModel.Relation;

import java.util.ArrayList;

public class Tools {

    public String typeofInActors(String id, ArrayList<Node> Nodes) {
        for (int i = 0; i < Nodes.size(); i++) {
            if (Nodes.get(i).getId().equals(id)) {
                return Nodes.get(i).getType();
            }
        }
        return "";
    }

    public String nameInActors(String id, ArrayList<Node> Nodes) {
        for (int i = 0; i < Nodes.size(); i++) {
            if (Nodes.get(i).getId().equals(id)) {
                return Nodes.get(i).getName();
            }
        }
        return "";
    }


    public Node inNode(String id,ArrayList<Node>Nodes){
        for (int i = 0; i < Nodes.size(); i++) {
            for(int j = 0;j<Nodes.get(i).getNodes().size();j++){
                if(id.equals(Nodes.get(i).getNodes().get(j).getId())){
                    return Nodes.get(i);
                }
            }
        }
        return null;
    }

    public String alreadyID(String id, ArrayList<Actor> actors){
        for(int i =0;i<actors.size();i++){
            if(id.equals(actors.get(i).getIdSistem())){
                id = id+id;
                i=0;
            }
        }
        return id;
    }


}
