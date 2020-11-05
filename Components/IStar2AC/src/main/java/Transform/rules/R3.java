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

public class R3 extends Rule {

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
                                        typeOrigin.equals("Actor")
                                        || typeOrigin.equals("Agent")
                                        || typeOrigin.equals("Role")
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
                    typeTarget = t.inNode(IS.getRelations().get(i).getTarget(),IS.getNodes()).getType();
                    String idTarget = t.alreadyID(IS.getRelations().get(i).getTarget(),AC.getActors());
                    String idOrigin = t.alreadyID(IS.getRelations().get(i).getOrigin(),AC.getActors());
                    if (typeTarget.equals("Actor")) {
                        AC.getActors().add(new Actor(idTarget, "",  t.inNode(IS.getRelations().get(i).getTarget(),IS.getNodes()).getName(), "Actor"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("Actor");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeTarget.equals("Role")) {
                        AC.getActors().add(new Actor(idTarget, "", t.inNode(IS.getRelations().get(i).getTarget(),IS.getNodes()).getName(), "RelationalRole"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalRole");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeTarget.equals("Agent")) {
                        AC.getActors().add(new Actor(idTarget, "", t.inNode(IS.getRelations().get(i).getTarget(),IS.getNodes()).getName(), "RelationalAgent"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalAgent");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    //origin
                    if (typeOrigin.equals("Actor")) {
                        AC.getActors().add(new Actor(idOrigin, "", t.nameInActors(IS.getRelations().get(i).getOrigin(),IS.getNodes()), "Actor"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("Actor");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeOrigin.equals("Role")) {
                        AC.getActors().add(new Actor(idOrigin, "", t.nameInActors(IS.getRelations().get(i).getOrigin(),IS.getNodes()), "RelationalRole"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalRole");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeOrigin.equals("Agent")) {
                        AC.getActors().add(new Actor(idOrigin, "",t.nameInActors(IS.getRelations().get(i).getOrigin(),IS.getNodes()), "RelationalAgent"));
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
                    AC.getCommunicativeInteractions().add(new CommunicativeInteraction(idTarget + IS.getRelations().get(i).getId(), "", name, "", idTarget, IS.getRelations().get(i).getId(), messageStructure));
                    AC.getCommunicativeInteractions().add(new CommunicativeInteraction( IS.getRelations().get(i).getId()+idOrigin, "", name, "", IS.getRelations().get(i).getId(), idOrigin, messageStructure));

                }
            }
        }
    }
}