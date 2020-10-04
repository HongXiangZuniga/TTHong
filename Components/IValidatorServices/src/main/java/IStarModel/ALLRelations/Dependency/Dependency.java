package IStarModel.Dependency;

import CommonModel.Relation;
import IStarModel.Nodes.Role;

public class Dependency extends Relation {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Dependency(String id, String origin, String target, String name) {
        super(id,origin, target, "GoalDependecy");
        Name = name;
    }

    @Override
    public boolean isValid(){
        if(getOrigin() ==""){
            return false;
        }
        if(getTarget() ==""){
            return false;
        }
        return true;
    }
}
