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

public class R4 extends Rule {

    @Override
    public void run(IstarModel IS, ACModel AC) {
        for (int i = 0; i < IS.getRelations().size(); i++) {
            if (IS.getRelations().get(i).getType().equals("Goal")
                    || IS.getRelations().get(i).getType().equals("Quality")
                    || IS.getRelations().get(i).getType().equals("Resource")
                    || IS.getRelations().get(i).getType().equals("Task")
            ) {
                String name ="";
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
                                                typeTarget.equals("NodeGoal")
                                                || typeTarget.equals("NodeQuality")
                                                || typeTarget.equals("NodeResource")
                                                || typeTarget.equals("NodeTask")
                                )

                ) {

                    String sr1 = "";
                    if (typeTarget.equals("NodeTask")) {
                        sr1 = typeTarget;
                    }

                    if (typeOrigin.equals("NodeTask")) {
                        sr1 = typeTarget;
                    }
                    typeTarget = t.inNode(IS.getRelations().get(i).getTarget(),IS.getNodes()).getType();
                    typeOrigin = t.inNode(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getType();
                    //Origen
                    if (typeTarget.equals("Actor")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getTarget(), "", t.inNode(IS.getRelations().get(i).getTarget(),IS.getNodes()).getName(), "Actor"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("Actor");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeTarget.equals("Role")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getTarget(), "", t.inNode(IS.getRelations().get(i).getTarget(),IS.getNodes()).getName(), "RelationalRole"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalRole");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeTarget.equals("Agent")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getTarget(), "", t.inNode(IS.getRelations().get(i).getTarget(),IS.getNodes()).getName(), "RelationalAgent"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalAgent");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    //Destinatario
                    if (typeOrigin.equals("Actor")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getOrigin(), "", t.inNode(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getName(), "Actor"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("Actor");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeOrigin.equals("Role")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getOrigin(), "", t.inNode(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getName(), "RelationalRole"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalRole");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeOrigin.equals("Agent")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getOrigin(), "", t.inNode(IS.getRelations().get(i).getOrigin(),IS.getNodes()).getName(), "RelationalAgent"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalAgent");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if(IS.getRelations().get(i).getType().equals("Goal")){
                        name ="Atain "+IS.getRelations().get(i).getText();
                    }
                    if(IS.getRelations().get(i).getType().equals("Resource")){
                        name ="Obtained "+IS.getRelations().get(i).getText();
                    }
                    if(IS.getRelations().get(i).getType().equals("Quality")){
                        name ="Satisficed "+IS.getRelations().get(i).getText();
                    }
                    if(IS.getRelations().get(i).getType().equals("Task")){
                        name ="Completed "+IS.getRelations().get(i).getText();
                    }
                    ArrayList<CommunicativeEvent> internalCommunicativeEvent = new ArrayList<>();
                    AC.getCommunicativeEvents().add(new CommunicativeEvent(
                            IS.getRelations().get(i).getId(),
                            "",
                            sr1.substring(4),
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
                    MessageStructure messageStructure = new MessageStructure(name, "");
                    AC.getCommunicativeInteractions().add(new CommunicativeInteraction(IS.getRelations().get(i).getTarget() + IS.getRelations().get(i).getId(), "", name, "", IS.getRelations().get(i).getTarget(), IS.getRelations().get(i).getId(), messageStructure));
                    AC.getCommunicativeInteractions().add(new CommunicativeInteraction( IS.getRelations().get(i).getId()+IS.getRelations().get(i).getOrigin(), "", name, "", IS.getRelations().get(i).getId(), IS.getRelations().get(i).getOrigin(), messageStructure));

                }
                }
            }
        }
    }
