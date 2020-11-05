package Adapter;

import ACModel.ACModel;
import AdapterModel.AdapterACModel;
import AdapterModel.elements.*;

public class Adapter {

    public void run(ACModel ac, AdapterACModel acd){
        int x =1;
        int y =1;
        for(int i=0;i<ac.getCommunicativeEvents().size();i++){
            acd.getCommunicativeEvents().add(new AdapterCommunicativeEvent(ac.getCommunicativeEvents().get(i),x*20,y*20));
            y = y+5;
        }
        for(int i=0;i<ac.getCommunicativeInteractions().size();i++){
            acd.getCommunicativeInteractions().add(new AdapterCommunicativeInteraction(ac.getCommunicativeInteractions().get(i)));
        }
        x=x+20;
        for(int i=0;i<ac.getActors().size();i++){
            acd.getActors().add(new AdapterActor(ac.getActors().get(i),x*20,y*20));
            y = y+5;
        }
        x=x+20;
        for(int i=0;i<ac.getSpecialisedCommunicativeEvents().size();i++){
            acd.getSpecialisedCommunicativeEvents().add(new AdapterSpecialisedCommunicativeEvent(ac.getSpecialisedCommunicativeEvents().get(i),x,y));
            y = y+5;
        }
        x=x+20;
        for(int i=0;i<ac.getPrecedenceRelations().size();i++){
            acd.getPrecedenceRelations().add(new AdapterPrecedenceRelation(ac.getPrecedenceRelations().get(i)));
        }
    }
}
