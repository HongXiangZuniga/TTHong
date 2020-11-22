package Adapter;

import ACModel.ACModel;
import AdapterModel.AdapterACModel;
import AdapterModel.elements.*;

public class Adapter {

    public void run(ACModel ac, AdapterACModel acd){
        int y =100;
        for(int i=0;i<ac.getCommunicativeEvents().size();i++){
            acd.getCommunicativeEvents().add(new AdapterCommunicativeEvent(ac.getCommunicativeEvents().get(i),400,y));

            /*Source*/
            for(int j=0;j<ac.getCommunicativeInteractions().size();j++){
                if(ac.getCommunicativeInteractions().get(j).getTarget().equals(ac.getCommunicativeEvents().get(i).getIdSistem())){
                    for(int k =0;k<ac.getActors().size();k++){
                        if(ac.getActors().get(k).getIdSistem().equals(ac.getCommunicativeInteractions().get(j).getSource())){
                            acd.getActors().add(new AdapterActor(ac.getActors().get(k),100,y));
                        }
                    }
                }
            }
            /*Target*/
            for(int j=0;j<ac.getCommunicativeInteractions().size();j++){
                if(ac.getCommunicativeInteractions().get(j).getSource().equals(ac.getCommunicativeEvents().get(i).getIdSistem())){
                    for(int k =0;k<ac.getActors().size();k++){
                        if(ac.getActors().get(k).getIdSistem().equals(ac.getCommunicativeInteractions().get(j).getTarget())){
                            acd.getActors().add(new AdapterActor(ac.getActors().get(k),800,y));
                        }
                    }
                }
            }
        y = y +180;
        }
        for(int i=0;i<ac.getCommunicativeInteractions().size();i++){
            acd.getCommunicativeInteractions().add(new AdapterCommunicativeInteraction(ac.getCommunicativeInteractions().get(i)));
        }
        /*Esto no Aparece en la transformacion*/
        for(int i=0;i<ac.getSpecialisedCommunicativeEvents().size();i++){
            acd.getSpecialisedCommunicativeEvents().add(new AdapterSpecialisedCommunicativeEvent(ac.getSpecialisedCommunicativeEvents().get(i),0,0));
        }
        for(int i=0;i<ac.getPrecedenceRelations().size();i++){
            acd.getPrecedenceRelations().add(new AdapterPrecedenceRelation(ac.getPrecedenceRelations().get(i)));
        }
        acd.setTrazability(ac.getTrazability());
    }
}
