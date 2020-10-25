package Transform.rules;

import ACModel.ACModel;
import ACModel.elements.Actor;
import IStarModel.IstarModel;

public class R3 extends GeneralRule{

    public void run(IstarModel IS , ACModel AC) {
        for(int i = 0;i<IS.getNodes().size();i++){
            if(IS.getNodes().get(i).getType().equals("NodeGoal")){
                AC.actors.add(new Actor(IS.getNodes().get(i).getId(),"",IS.getNodes().get(i).getName(),"OrganisationalGoal"));
            }
        }
    }
}
