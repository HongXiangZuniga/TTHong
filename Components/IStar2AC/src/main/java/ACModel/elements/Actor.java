package ACModel.elements;

public class Actor {
    private String idSistem;
    private String idUser;
    private String name;
    private String type;

    public String getIdSistem() {
        return idSistem;
    }

    public void setIdSistem(String idSistem) {
        this.idSistem = idSistem;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public Actor(String idSistem, String idUser, String name, String type) {
        this.idSistem = idSistem;
        this.idUser = idUser;
        this.name = name;
        this.type = type;
    }
}
