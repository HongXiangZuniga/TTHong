package CommonModel;

import IStarModel.IstarModel;

import java.util.ArrayList;

public class Node {

    private String Id;
    private String Name;
    private String Type;
    private ArrayList<Node> nodes;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public Node(String id, String name, String type) {
        Id = id;
        Name = name;
        Type = type;
        nodes = new ArrayList<>();
    }

    public boolean isValid(){
        return true;
    }
}
