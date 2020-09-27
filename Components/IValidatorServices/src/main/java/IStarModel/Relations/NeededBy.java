package IStarModel.Relations;

import CommonModel.Relation;

public class NeededBy extends Relation {

    public NeededBy(String origin, String target) {
        super(origin, target, "NeededBy");
    }
}
