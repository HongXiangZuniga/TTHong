package AdapterModel.elements.subElements;

public class SupportActor {
    private String unique;
    private String identifier;
    private String name;
    private String type;

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

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

    public SupportActor(String unique, String identifier, String name, String type) {
        this.unique = unique;
        this.identifier = identifier;
        this.name = name;
        this.type = type;
    }
}
