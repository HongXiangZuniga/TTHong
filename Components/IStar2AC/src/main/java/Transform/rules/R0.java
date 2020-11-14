package Transform.rules;

import ACModel.ACModel;
import ACModel.elements.Actor;
import ACModel.elements.CommunicativeEvent;
import ACModel.elements.CommunicativeInteraction;
import ACModel.elements.subElements.MessageStructure;
import IStarModel.IstarModel;

public class R0 extends Rule{

    public void run(IstarModel IS, ACModel AC) {

        for(int i=0;i<IS.getNodes().size();i++){

            if((IS.getNodes().get(i).getType().equals("Actor"))||(IS.getNodes().get(i).getType().equals("Role"))||(IS.getNodes().get(i).getType().equals("Agent"))){
                AC.getCommunicativeEvents().add(new CommunicativeEvent(
                        "A1"+IS.getNodes().get(i).getName(),
                        "",
                        "Register "+IS.getNodes().get(i).getName() ,
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        new Actor("", "", "", "")
                ));
                AC.getActors().add(new Actor(
                        "A0"+IS.getNodes().get(i).getName(),
                        "0",
                        "Registrer " + IS.getNodes().get(i).getName(),
                        "actor")
                );
                AC.getCommunicativeInteractions().add(new CommunicativeInteraction("A2"+IS.getNodes().get(i).getName(), "", "To register Information of "+IS.getNodes().get(i).getName(), "", "A0"+IS.getNodes().get(i).getName(), "A1"+IS.getNodes().get(i).getName(), new MessageStructure("RegisterInformation", "")));
            }
        }
    }
}


