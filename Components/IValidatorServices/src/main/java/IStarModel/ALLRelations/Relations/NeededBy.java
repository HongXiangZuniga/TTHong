package IStarModel.Relations;

import CommonModel.Relation;

public class NeededBy extends Relation {

    public NeededBy(String id,String origin, String target) {
        super(id,origin, target, "NeededBy");
    }
}
