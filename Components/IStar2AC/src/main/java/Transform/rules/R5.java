package Transform.rules;

import ACModel.ACModel;
import ACModel.elements.CommunicativeInteraction;
import ACModel.elements.PrecedenceRelation;
import ACModel.elements.subElements.MessageStructure;
import IStarModel.IstarModel;
import Tools.Tools;

import java.util.ArrayList;

public class R5 extends Rule {

    @Override
    public void run(IstarModel IS, ACModel AC) {
        Tools tool= new Tools();
    for(int i=0;i<IS.getRelations().size();i++){
        for(int j=i+1;j<IS.getRelations().size()-1;j++){
            if(IS.getRelations().get(i).getText().equals(IS.getRelations().get(j).getText())){
                if(IS.getRelations().get(i).getTarget().equals(IS.getRelations().get(j).getOrigin())){
                    AC.getPrecedenceRelations().add((new PrecedenceRelation(IS.getRelations().get(i).getId()+IS.getRelations().get(j).getId(),"",IS.getRelations().get(j).getId(),IS.getRelations().get(i).getId())));
                }
            }
            }
        }
    for(int i=IS.getRelations().size()-1;i>0;i--){
        for(int j=i-1;j>=0;j--){
            if(IS.getRelations().get(i).getText().equals(IS.getRelations().get(j).getText())){
                if((IS.getRelations().get(i).getOrigin().equals(IS.getRelations().get(j).getTarget()))){
                    if(tool.alreadyPrecedence(IS.getRelations().get(i).getId(),IS.getRelations().get(j).getId(),AC.getPrecedenceRelations()))
                    AC.getPrecedenceRelations().add((new PrecedenceRelation(IS.getRelations().get(i).getId()+IS.getRelations().get(j).getId(),"",IS.getRelations().get(i).getId(),IS.getRelations().get(j).getId())));
                }
            }
        }
     }
    }
}

