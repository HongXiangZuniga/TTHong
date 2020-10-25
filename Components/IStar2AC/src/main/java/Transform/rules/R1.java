package Transform.rules;

import java.util.ArrayList;

import ACModel.ACModel;
import ACModel.elements.Actor;
import ACModel.elements.CommunicativeEvent;
import ACModel.elements.CommunicativeInteraction;
import ACModel.elements.subElements.MessageStructure;
import IStarModel.ALLRelations.RelationsDependencies.RelationQuality;
import IStarModel.IstarModel;
import tools.tools;

public class R1 extends GeneralRule{

    public void run(IstarModel IS , ACModel AC){
        for(int i = 0;i<IS.getRelations().size();i++){
            if(        IS.getRelations().get(i).getType().equals("Goal")
                    || IS.getRelations().get(i).getType().equals("Quality")
                    || IS.getRelations().get(i).getType().equals("Resource")
                    || IS.getRelations().get(i).getType().equals("Task")
            ){
                tools t = new tools();
                String typeTarget = t.typeofInActors(IS.getRelations().get(i).getOrigin(),IS.getNodes());
                String typeSource = t.typeofInActors(IS.getRelations().get(i).getTarget(),IS.getNodes());
                if(typeTarget.equals("Actor")){
                    AC.getActors().add(new Actor(IS.getRelations().get(i).getId(),"",t.thisActor(IS.getRelations().get(i).getTarget(),IS.getNodes()).getName(),"Actor"));
                }
                if(typeTarget.equals("Role")){
                    AC.getActors().add(new Actor(IS.getRelations().get(i).getId(),"",t.thisActor(IS.getRelations().get(i).getTarget(),IS.getNodes()).getName(),"RelationalRole"));
                }
                if(typeTarget.equals("Agent")){
                    AC.getActors().add(new Actor(IS.getRelations().get(i).getId(),"",t.thisActor(IS.getRelations().get(i).getTarget(),IS.getNodes()).getName(),"RelationalAgent"));
                }
                if(typeSource.equals("Actor")){
                    AC.getActors().add(new Actor(IS.getRelations().get(i).getId(),"",t.thisActor(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getName(),"Actor"));
                }
                if(typeSource.equals("Role")){
                    AC.getActors().add(new Actor(IS.getRelations().get(i).getId(),"",t.thisActor(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getName(),"RelationalRole"));
                }
                if(typeSource.equals("Agent")){
                    AC.getActors().add(new Actor(IS.getRelations().get(i).getId(),"",t.thisActor(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getName(),"RelationalAgent"));
                }
                ArrayList<Actor> array = new ArrayList<>();
                array.add(new Actor("","","",""));
                AC.getCommunicativeEvents().add(new CommunicativeEvent(
                    IS.getRelations().get(i).getId(),
                    "",
                    IS.getRelations().get(i).getText(),
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    array
                ));
                AC.getCommunicativeInteractions().add(new CommunicativeInteraction(IS.getRelations().get(i).getId()+IS.getRelations().get(i).getTarget(), "", "", "", IS.getRelations().get(i).getTarget(), IS.getRelations().get(i).getId(), new MessageStructure("", "", new ArrayList<String>())));
                AC.getCommunicativeInteractions().add(new CommunicativeInteraction(IS.getRelations().get(i).getId()+IS.getRelations().get(i).getOrigin(), "", "", "", IS.getRelations().get(i).getId(), IS.getRelations().get(i).getOrigin(), new MessageStructure("", "", new ArrayList<String>())));
            }
        }
    }
}
