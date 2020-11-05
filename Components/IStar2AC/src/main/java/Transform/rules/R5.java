package Transform.rules;

import ACModel.ACModel;
import ACModel.elements.CommunicativeInteraction;
import ACModel.elements.subElements.MessageStructure;
import IStarModel.IstarModel;

import java.util.ArrayList;

public class R5 extends Rule {

    @Override
    public void run(IstarModel IS, ACModel AC) {
    for(int i =0;i<AC.getCommunicativeEvents().size();i++){
        String text = AC.getCommunicativeEvents().get(i).getName();
        for(int j =i+1;j<AC.getCommunicativeEvents().size()-1+1;j++){
            if(text.equals(AC.getCommunicativeEvents().get(j).getName())){
                AC.getCommunicativeInteractions().add(new CommunicativeInteraction(IS.getRelations().get(i).getId()+IS.getRelations().get(i).getTarget(), "", "", "", AC.getCommunicativeEvents().get(i).getIdSistem(),AC.getCommunicativeEvents().get(j).getIdSistem(), new MessageStructure("M", "")));
            }
        }
        }
    }
}
