package tools;

import CommonModel.Node;
import CommonModel.Relation;
import IStarModel.ALLNodes.Nodes.Actor;

import java.util.ArrayList;

public class tools {

    public String typeofInActors(String id, ArrayList<Node> Nodes) {
        for (int i = 0; i < Nodes.size(); i++) {
            if (Nodes.get(i).getId().equals(id)) {
                /*System.out.println("match");*/
                return Nodes.get(i).getType();
            }
        }
        return "";
    }

    public String typeofInRelations(String id, ArrayList<Relation> Relations) {
        for (int i = 0; i < Relations.size(); i++) {
            if (Relations.get(i).getId().equals(id)) {
                /*System.out.println("match");*/
                return Relations.get(i).getType();
            }
        }
        return "";
    }

    public Node thisActor(String id, ArrayList<Node> Nodes) {
        for (int i = 0; i < Nodes.size(); i++) {
            if (Nodes.get(i).getId().equals(id)) {
                /*System.out.println("match");*/
                return Nodes.get(i);
            }
        }
        return null;
    }

    public Node inNode(String id,ArrayList<Node>Nodes){
        for (int i = 0; i < Nodes.size(); i++) {
            for(int j = 0;j<Nodes.get(i).subModel.getNodes().size();j++){
                if(id.equals(Nodes.get(i).subModel.getNodes().get(j).getId())){
                    return Nodes.get(i);
                }
            }
        }
        return null;
    }

    public String typeInNode(String id,ArrayList<Node>Nodes){
        for (int i = 0; i < Nodes.size(); i++) {
            for(int j = 0;j<Nodes.get(i).subModel.getNodes().size();j++){
                if(id.equals(Nodes.get(i).subModel.getNodes().get(j).getId())){
                    return Nodes.get(i).subModel.getNodes().get(j).getType();
                }
            }
        }
        return null;
    }





}
