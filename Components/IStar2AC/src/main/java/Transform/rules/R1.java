package Transform.rules;

import java.util.ArrayList;

import ACModel.ACModel;
import ACModel.elements.Actor;
import ACModel.elements.CommunicativeEvent;
import ACModel.elements.CommunicativeInteraction;
import ACModel.elements.subElements.MessageStructure;
import IStarModel.IstarModel;
import Tools.Tools;

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
                "",
                new Actor("", "", "", "")
        ));
        AC.getCommunicativeInteractions().add(new CommunicativeInteraction("A2", "", "RegisterInformation", "", "A0", "A1", new MessageStructure("RegisterInformation", "")));


        for (int i = 0; i < IS.getRelations().size(); i++) {
            if
            (    IS.getRelations().get(i).getType().equals("Goal")
                    || IS.getRelations().get(i).getType().equals("Quality")
                    || IS.getRelations().get(i).getType().equals("Resource")
                    || IS.getRelations().get(i).getType().equals("Task")
            )


            {
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
                                                typeTarget.equals("Actor")
                                                || typeTarget.equals("Agent")
                                                || typeTarget.equals("Role")
                                )

                ) {

                    if (typeTarget.equals("Actor")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getTarget(), "", t.nameInActors(IS.getRelations().get(i).getTarget(),IS.getNodes()), "Actor"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("Actor");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeTarget.equals("Role")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getTarget(), "", t.nameInActors(IS.getRelations().get(i).getTarget(),IS.getNodes()), "RelationalRole"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalRole");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeTarget.equals("Agent")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getTarget(), "", t.nameInActors(IS.getRelations().get(i).getTarget(),IS.getNodes()), "RelationalAgent"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalAgent");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeOrigin.equals("Actor")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getOrigin(), "", t.nameInActors(IS.getRelations().get(i).getOrigin(),IS.getNodes()), "Actor"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("Actor");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeOrigin.equals("Role")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getOrigin(), "", t.nameInActors(IS.getRelations().get(i).getOrigin(),IS.getNodes()), "RelationalRole"));
                        ArrayList<String> aux = new ArrayList<>();
                        aux.add(IS.getRelations().get(i).getType());
                        aux.add("RelationalRole");
                        aux.add(IS.getRelations().get(i).getId());
                        AC.getTrazability().add(aux);
                    }
                    if (typeOrigin.equals("Agent")) {
                        AC.getActors().add(new Actor(IS.getRelations().get(i).getOrigin(), "", t.nameInActors(IS.getRelations().get(i).getOrigin(),IS.getNodes()), "RelationalAgent"));
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
                    AC.getCommunicativeEvents().add(new CommunicativeEvent(
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
                            "","",
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