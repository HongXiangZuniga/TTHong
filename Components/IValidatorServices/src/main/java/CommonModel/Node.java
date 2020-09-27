package CommonModel;

public class Node {

    private String Id;
    private String Name;
    private String Type;

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

    public Node(String id, String name, String type) {
        Id = id;
        Name = name;
        Type = type;
    }

    public void setType(String type) {
        Type = type;
    }
}
