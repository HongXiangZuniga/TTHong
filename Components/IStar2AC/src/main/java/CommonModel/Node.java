package CommonModel;

import IStarModel.IstarModel;

public class Node {

    private String Id;
    private String Name;
    private String Type;
    public IstarModel subModel = new IstarModel();

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


    public Node(String id, String name, String type) {
        Id = id;
        Name = name;
        Type = type;
    }

    public boolean isValid(){
        return true;
    }
}
