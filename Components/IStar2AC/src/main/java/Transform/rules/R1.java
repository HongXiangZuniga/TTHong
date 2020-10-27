package Transform.rules;

import java.util.ArrayList;

import ACModel.ACModel;
import ACModel.elements.Actor;
import ACModel.elements.CommunicativeEvent;
import ACModel.elements.CommunicativeInteraction;
import ACModel.elements.SpecialisedCommunicativeEvent;
import ACModel.elements.subElements.MessageStructure;
import CommonModel.Node;
import IStarModel.IstarModel;
import org.apache.tomcat.jni.Error;
import org.springframework.boot.ExitCodeEvent;
import tools.tools;

public class R1 extends Rule {

    public void run(IstarModel IS, ACModel AC) {
        AC.getActors().add(new Actor("A0",
                "0",
                "Admin",
                "actor")
        );
        AC.getCommunicativeEvents().add(new CommunicativeEvent(
                "A1",
                "",
                "Register",
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
        AC.getCommunicativeInteractions().add(new CommunicativeInteraction("A2", "", "RegisterInformation", "", "A1", "A2", new MessageStructure("RegisterInformation", "", new ArrayList<String>())));


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
                                                typeTarget.equals("Actor")
                                                || typeTarget.equals("Agent")
                                                || typeTarget.equals("Role")
                                )

                ) {
                    if (typeTarget.equals("Actor")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getTarget(), IS.getNodes()).getName(), "Actor"));
                    }
                    if (typeTarget.equals("Role")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getTarget(), IS.getNodes()).getName(), "RelationalRole"));
                    }
                    if (typeTarget.equals("Agent")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getTarget(), IS.getNodes()).getName(), "RelationalAgent"));
                    }
                    if (typeSource.equals("Actor")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getOrigin(), IS.getNodes()).getName(), "Actor"));
                    }
                    if (typeSource.equals("Role")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getOrigin(), IS.getNodes()).getName(), "RelationalRole"));
                    }
                    if (typeSource.equals("Agent")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getId(), "", t.thisActor(IS.getRelations().get(i).getOrigin(), IS.getNodes()).getName(), "RelationalAgent"));
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
                            new Actor("", "", "", "")
                    ));
                    AC.getCommunicativeInteractions().add(new CommunicativeInteraction(IS.getRelations().get(i).getId()+IS.getRelations().get(i).getTarget(), "", "", "", IS.getRelations().get(i).getTarget(), IS.getRelations().get(i).getId(), new MessageStructure("M", "", new ArrayList<String>())));
                    AC.getCommunicativeInteractions().add(new CommunicativeInteraction(IS.getRelations().get(i).getId()+IS.getRelations().get(i).getOrigin(), "", "", "", IS.getRelations().get(i).getId(), IS.getRelations().get(i).getOrigin(), new MessageStructure("M", "", new ArrayList<String>())));
                }
            }
        }
    }
}