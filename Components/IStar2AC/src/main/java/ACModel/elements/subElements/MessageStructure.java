package ACModel.elements.subElements;

import java.util.ArrayList;

public class MessageStructure {
    private String name;
    private String type;
    private ArrayList<String> children = new ArrayList<>();//Por ahora sera String

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<String> children) {
        this.children = children;
    }

    public MessageStructure(String name, String type, ArrayList<String> children) {
        this.name = name;
        this.type = type;
        this.children = children;
    }
}
