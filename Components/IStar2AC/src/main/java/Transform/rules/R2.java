package Transform.rules;

import ACModel.ACModel;
import ACModel.elements.Actor;
import ACModel.elements.CommunicativeEvent;
import ACModel.elements.CommunicativeInteraction;
import ACModel.elements.SpecialisedCommunicativeEvent;
import ACModel.elements.subElements.MessageStructure;
import IStarModel.IstarModel;
import Tools.Tools;

import java.util.ArrayList;

public class R2 extends Rule {

    @Override
    public void run(IstarModel IS, ACModel AC) {

        for (int i = 0; i < IS.getRelations().size(); i++) {
            if (IS.getRelations().get(i).getType().equals("Goal")
                    || IS.getRelations().get(i).getType().equals("Quality")
                    || IS.getRelations().get(i).getType().equals("Resource")
                    || IS.getRelations().get(i).getType().equals("Task")
            ) {
                Tools t = new Tools();
                String typeTarget = t.typeofInActors(IS.getRelations().get(i).getTarget(), IS.getNodes());
                String typeOrigin = t.typeofInActors(IS.getRelations().get(i).getOrigin(), IS.getNodes());
                if (
                        (
                                typeOrigin.equals("NodeGoal")
                                        || typeOrigin.equals("NodeQuality")
                                        || typeOrigin.equals("NodeResource")
                                        || typeOrigin.equals("NodeTask")
                        )
                                &&
                                (
                                        typeTarget.equals("Actor")
                                                || typeTarget.equals("Agent")
                                                || typeTarget.equals("Role")
                                )

                ) {
                    String sr1 = "";
                    if (typeOrigin.equals("NodeTask")) {
                        sr1 = t.nameInActors(IS.getRelations().get(i).getOrigin(), IS.getNodes());
                    }
                    String idTarget = t.alreadyID(IS.getRelations().get(i).getTarget(),AC.getActors());
                    String idOrigin = t.alreadyID(IS.getRelations().get(i).getOrigin(),AC.getActors());

                    String name ="";
                    String inte="";
                    String msg ="";
                    if(IS.getRelations().get(i).getType().equals("Resource")){
                        if(sr1.equals("")){
                            name = IS.getRelations().get(i).getText();;
                        }else{
                            name = sr1;
                        }
                        msg = IS.getRelations().get(i).getText() + " info";
                        inte="Provision";
                    }

                    if(IS.getRelations().get(i).getType().equals("Task")){
                        if(sr1.equals("")){
                            name = "Acomplish "+IS.getRelations().get(i).getText();;
                        }else{
                            name = sr1;
                        }
                        msg = IS.getRelations().get(i).getText() + " accomplishment";
                        inte="Acomplishment";

                    }
                    if(IS.getRelations().get(i).getType().equals("Quality")){
                        if(sr1.equals("")){
                            name = "Satisfy "+IS.getRelations().get(i).getText();;
                        }else{
                            name = sr1;
                        }
                        msg = IS.getRelations().get(i).getText() + " satisfaction";
                        inte="Satisfaction";

                    }

                    if(IS.getRelations().get(i).getType().equals("Goal")){
                        if(sr1.equals("")){
                            name = "Attain "+IS.getRelations().get(i).getText();;
                        }else{
                            name = sr1;
                        }
                        msg = IS.getRelations().get(i).getText() + " attainment";
                        inte="Attainment";

                    }


                    typeOrigin = t.inNode(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getType();
                    if (typeTarget.equals("Actor")) {
                        AC.getActors().add(new Actor(idTarget, "", t.nameInActors(IS.getRelations().get(i).getTarget(),IS.getNodes()), "Actor"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("Actor");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeTarget.equals("Role")) {
                        AC.getActors().add(new Actor(idTarget, "", t.nameInActors(IS.getRelations().get(i).getTarget(),IS.getNodes()),  "RelationalRole"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalRole");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeTarget.equals("Agent")) {
                        AC.getActors().add(new Actor(idTarget, "", t.nameInActors(IS.getRelations().get(i).getTarget(),IS.getNodes()), "RelationalAgent"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalAgent");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }

                    if (typeOrigin.equals("Actor")) {
                        AC.getActors().add(new Actor(idOrigin, "", t.inNode(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getName(), "Actor"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("Actor");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeOrigin.equals("Role")) {
                        AC.getActors().add(new Actor(idOrigin, "",  t.inNode(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getName(), "RelationalRole"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelatonalRole");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeOrigin.equals("Agent")) {
                        AC.getActors().add(new Actor(idOrigin, "",  t.inNode(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getName(), "RelationalAgent"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalAgent");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    ArrayList<CommunicativeEvent> internalCommunicativeEvent = new ArrayList<>();
                    AC.getCommunicativeEvents().add(new CommunicativeEvent(
                            IS.getRelations().get(i).getId(),
                            "",
                            name,
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
                    MessageStructure messageStructure = new MessageStructure(msg, "");
                    AC.getCommunicativeInteractions().add(new CommunicativeInteraction(idTarget + IS.getRelations().get(i).getId(), "", msg, "", idTarget, IS.getRelations().get(i).getId(), messageStructure));
                    AC.getCommunicativeInteractions().add(new CommunicativeInteraction( IS.getRelations().get(i).getId()+idOrigin, "", msg, "", IS.getRelations().get(i).getId(), idOrigin, messageStructure));
                }
            }
        }
    }
}