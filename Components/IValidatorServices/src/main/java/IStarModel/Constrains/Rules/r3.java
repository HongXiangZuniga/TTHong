package IStarModel.Constrains.Rules;

import CommonModel.Node;
import CommonModel.Relation;
import IStarModel.Constrains.Class.Rule;
import IStarModel.Constrains.Tools.Tools;

import java.util.ArrayList;

public class r2 extends Rule {


    @Override
    public boolean run(ArrayList<Node> Nodes , ArrayList<Relation> Relations, ArrayList<ArrayList<String>> Errors){
        Tools tool = new Tools();
        for (int i=0;i<Relations.size();i++){
            if(Relations.get(i).getType().equals("istar.ParticipatesInLink")){
                try{
                    if((Relations.get(i).getOrigin().equals("Actor") ||Relations.get(i).getOrigin().equals("Role") ||Relations.get(i).equals("Agent")) &&(Relations.get(i).getTarget().equals("Actor") ||Relations.get(i).getTarget().equals("Role") ||Relations.get(i).getTarget().equals("Agent")) ){
                    }
                    else{
                        ArrayList<String> Error = new ArrayList<>();
                        Error.add("ErrorRelations");
                        Error.add(Relations.get(i).getId());
                        Errors.add(Error);
                        return false;
                    }
                }catch(Exception e) {
                    System.out.println(e.toString());
                    ArrayList<String> Error = new ArrayList<>();
                    Error.add("ErrorRelations");
                    Error.add(Relations.get(i).getId());
                    Errors.add(Error);
                    return false;
                }
            }
        }
        return true;
    }
}
