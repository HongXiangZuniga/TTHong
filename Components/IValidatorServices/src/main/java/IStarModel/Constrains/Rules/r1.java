package IStarModel.Constrains.Rules;

import CommonModel.Node;
import CommonModel.Relation;
import IStarModel.Constrains.Class.Rule;
import IStarModel.Constrains.Tools.Tools;

import java.util.ArrayList;

public class r1 extends Rule {


    @Override
    public boolean run(ArrayList<Node> Nodes , ArrayList<Relation> Relations, ArrayList<ArrayList<String>> Errors){
        Tools tool = new Tools();
        for (int i=0;i<Relations.size();i++){
            if(Relations.get(i).getType().equals("istar.IsALink")){
                try{
                    if((tool.typeof(Relations.get(i).getOrigin(),Nodes).equals("Actor") && tool.typeof(Relations.get(i).getTarget(),Nodes).equals("Actor")) || ((tool.typeof(Relations.get(i).getOrigin(),Nodes).equals("Role") && tool.typeof(Relations.get(i).getTarget(),Nodes).equals("Role"))) ){
                    }
                    else{
                        ArrayList<String> Error = new ArrayList<>();
                        Error.add("ErrorRelations");
                        Error.add(Relations.get(i).getId());
                        Errors.add(Error);
                    }
                }catch(Exception e) {
                    ArrayList<String> Error = new ArrayList<>();
                    Error.add("ErrorRelations");
                    Error.add(Relations.get(i).getId());
                    Errors.add(Error);
                }    }
        }
        return true;
    }
}
