package IStarModel.Constrains.Rules;

import CommonModel.Node;
import CommonModel.Relation;
import IStarModel.Constrains.Class.Rule;
import IStarModel.Constrains.Tools.Tools;

import java.util.ArrayList;

public class r3 extends Rule {


    @Override
    public boolean run(ArrayList<Node> Nodes , ArrayList<Relation> Relations, ArrayList<ArrayList<String>> Errors){
        Tools tool = new Tools();
        String typeOrigin = "";
        String typeTarget = "";
        for (int i=0;i<Relations.size();i++){
            if((Relations.get(i).getType().equals("And")) || (Relations.get(i).getType()).equals("Or")) {
                typeOrigin = tool.typeof(Relations.get(i).getOrigin(),Nodes);
                typeTarget = tool.typeof(Relations.get(i).getTarget(),Nodes);
                if((typeOrigin.equals("NodeGoal")&& typeTarget.equals("NodeGoal")) ||(typeOrigin.equals("NodeGoal")&&(typeTarget.equals("NodeTask"))) ||(typeOrigin.equals("NodeTask")&&(typeTarget.equals("NodeGoal"))) || (typeOrigin.equals("NodeTask")&& typeTarget.equals("NodeTask"))){
                    //System.out.println("ok");
                }else{
                    ArrayList<String> Error = new ArrayList<>();
                    Error.add("ErrorRelations");
                    Error.add(Relations.get(i).getId());
                    Errors.add(Error);
                    return false;
                }
            }
            if(Relations.get(i).getType().equals("Contribution")) {
                typeOrigin = tool.typeof(Relations.get(i).getOrigin(),Nodes);
                typeTarget = tool.typeof(Relations.get(i).getTarget(),Nodes);
                if ((typeOrigin.equals("NodeGoal") && typeTarget.equals("NodeQuality")) || (typeOrigin.equals("NodeQuality") && typeTarget.equals("NodeQuality"))  || (typeOrigin.equals("NodeTask") && typeTarget.equals("NodeQuality")) || (typeOrigin.equals("NodeResource") && typeTarget.equals("NodeQuality"))) {
                    //System.out.println("ok");
                } else {
                    ArrayList<String> Error = new ArrayList<>();
                    Error.add("ErrorRelations");
                    Error.add(Relations.get(i).getId());
                    Errors.add(Error);
                    return false;
                }
            }
            if(Relations.get(i).getType().equals("Qualification")){
                typeOrigin = tool.typeof(Relations.get(i).getOrigin(),Nodes);
                typeTarget = tool.typeof(Relations.get(i).getTarget(),Nodes);
                if((typeOrigin.equals("NodeQuality")&&typeTarget.equals("NodeGoal"))  || (typeOrigin.equals("NodeQuality")&&typeTarget.equals("NodeTask")) || (typeOrigin.equals("NodeQuality")&&typeTarget.equals("NodeResource"))){
                    //System.out.println("ok");
                } else {
                    ArrayList<String> Error = new ArrayList<>();
                    Error.add("ErrorRelations");
                    Error.add(Relations.get(i).getId());
                    Errors.add(Error);
                    return false;
                }
            }
            if(Relations.get(i).getType().equals("NeededBy")){
                typeOrigin = tool.typeof(Relations.get(i).getOrigin(),Nodes);
                typeTarget = tool.typeof(Relations.get(i).getTarget(),Nodes);
                if((typeOrigin.equals("NodeResource"))&&typeTarget.equals("NodeTask")){

                }else{
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
