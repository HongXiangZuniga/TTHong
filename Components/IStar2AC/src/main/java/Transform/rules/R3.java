package Transform.rules;

import ACModel.ACModel;
import ACModel.elements.Actor;
import ACModel.elements.CommunicativeEvent;
import ACModel.elements.CommunicativeInteraction;
import ACModel.elements.SpecialisedCommunicativeEvent;
import ACModel.elements.subElements.MessageStructure;
import IStarModel.IstarModel;
import tools.tools;

import java.util.ArrayList;

public class R3 extends Rule {

    public void run(IstarModel IS, ACModel AC) {
        for (int i = 0; i < IS.getRelations().size(); i++) {
            if (IS.getRelations().get(i).getType().equals("Goal")
                    || IS.getRelations().get(i).getType().equals("Quality")
                    || IS.getRelations().get(i).getType().equals("Resource")
                    || IS.getRelations().get(i).getType().equals("Task")
            ) {
                String name ="";
                tools t = new tools();
                String typeTarget = t.typeofInActors(IS.getRelations().get(i).getOrigin(), IS.getNodes());
                String typeSource = t.typeofInActors(IS.getRelations().get(i).getTarget(), IS.getNodes());
                if (
                        (
                                        typeSource.equals("Actor")
                                        || typeSource.equals("Agent")
                                        || typeSource.equals("Role")
                        )
                                &&
                                (
                                                typeTarget.equals("NodeGoal")
                                                || typeTarget.equals("NodeQuality")
                                                || typeTarget.equals("NodeResource")
                                                || typeTarget.equals("NodeTask")
                                )

                ) {
                    String sr1 = typeTarget;
                    typeTarget = t.typeofInActors(IS.getRelations().get(i).getOrigin(), IS.getNodes());
                    //Origen
                    if (typeTarget.equals("Actor")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getTarget(), IS.getNodes()).getName(), "Actor"));
                    }
                    if (typeTarget.equals("Role")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getTarget(), IS.getNodes()).getName(), "RelationalRole"));
                    }
                    if (typeTarget.equals("Agent")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getTarget(), IS.getNodes()).getName(), "RelationalAgent"));
                    }
                    //Destinatario
                    if (typeSource.equals("Actor")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getOrigin(), IS.getNodes()).getName(), "Actor"));
                    }
                    if (typeSource.equals("Role")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getOrigin(), IS.getNodes()).getName(), "RelationalRole"));
                    }
                    if (typeSource.equals("Agent")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getOrigin(), IS.getNodes()).getName(), "RelationalAgent"));
                    }
                    AC.getCommunicativeEvents().add(new CommunicativeEvent(
                            IS.getRelations().get(i).getId()+"I2",
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
                            new Actor("", "", "", "")
                    ));
                    ArrayList<CommunicativeEvent> internalCommunicativeEvent = new ArrayList<>();
                    internalCommunicativeEvent.add(new CommunicativeEvent(
                            IS.getRelations().get(i).getId()+"I2",
                            "",
                            sr1.substring(3),
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
                    AC.getSpecialisedCommunicativeEvents().add(new SpecialisedCommunicativeEvent(
                            IS.getRelations().get(i).getId(),
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
                            "",
                            "",
                            "",
                            internalCommunicativeEvent
                    ));
                    AC.getCommunicativeInteractions().add(new CommunicativeInteraction(IS.getRelations().get(i).getId()+IS.getRelations().get(i).getTarget(), "", "", "", IS.getRelations().get(i).getTarget(), IS.getRelations().get(i).getId(), new MessageStructure("M", "", new ArrayList<String>())));
                    AC.getCommunicativeInteractions().add(new CommunicativeInteraction(IS.getRelations().get(i).getId()+IS.getRelations().get(i).getOrigin(), "", "", "", IS.getRelations().get(i).getId(), IS.getRelations().get(i).getOrigin(), new MessageStructure("M", "", new ArrayList<String>())));
                }
            }
        }
    }
}