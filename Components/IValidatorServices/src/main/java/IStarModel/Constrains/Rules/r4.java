package IStarModel.Constrains.Rules;

import CommonModel.Node;
import CommonModel.Relation;
import IStarModel.Constrains.Class.Rule;
import IStarModel.Constrains.Tools.Tools;

import java.util.ArrayList;

public class r4 extends Rule {


    @Override
    public boolean run(ArrayList<Node> Nodes, ArrayList<Relation> Relations, ArrayList<ArrayList<String>> Errors) {
        Tools tool = new Tools();
        String typeOrigin = "";
        String typeTarget = "";
        for (int i = 0; i < Relations.size(); i++) {
            if (Relations.get(i).getOrigin().equals(Relations.get(i).getTarget())) {
                ArrayList<String> Error = new ArrayList<>();
                Error.add("RelationSourceEqualsTarget");
                Error.add(Relations.get(i).getId());
                Errors.add(Error);
            }
        }
        return true;
    }
}
