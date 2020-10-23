package IStarModel.Adapters;

import CommonModel.Node;
import CommonModel.Relation;
import IStarModel.ALLNodes.Nodes.Actor;
import IStarModel.ALLNodes.Nodes.Agent;
import IStarModel.ALLNodes.Nodes.Dependum;
import IStarModel.ALLNodes.Nodes.Role;
import IStarModel.ALLNodes.NodesDependencies.NodeGoal;
import IStarModel.ALLNodes.NodesDependencies.NodeQuality;
import IStarModel.ALLNodes.NodesDependencies.NodeResource;
import IStarModel.ALLNodes.NodesDependencies.NodeTask;
import IStarModel.ALLRelations.ActorLinks.IsALink;
import IStarModel.ALLRelations.ActorLinks.ParticipatesInLink;
import IStarModel.ALLRelations.Relations.*;
import IStarModel.ALLRelations.RelationsDependencies.RelationGoal;
import IStarModel.ALLRelations.RelationsDependencies.RelationQuality;
import IStarModel.ALLRelations.RelationsDependencies.RelationResource;
import IStarModel.ALLRelations.RelationsDependencies.RelationTask;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class pistartool {

    public boolean loadActors(JSONArray actors, ArrayList<Node> Nodes){
        try{
            /*Cargando Actores */
            for(int i =0;i<actors.length();i++){
                JSONObject actor = new JSONObject();
                actor = actors.getJSONObject(i);
                if(actor.getString("type").equals("istar.Role")){
                    if(actor.has("nodes")){
                        Nodes.add(new Role(actor.getString("id"),actor.getString("text"),actor.getJSONArray("nodes")));
                        JSONArray submodel = new JSONArray();
                        JSONObject subactor = new JSONObject();
                        submodel = actor.getJSONArray("nodes");
                        for(int j =0;j<submodel.length();j++){
                            subactor = submodel.getJSONObject(j);
                            if(subactor.getString("type").equals("istar.Goal")){
                                Nodes.add(new NodeGoal(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Task")){
                                Nodes.add(new NodeTask(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Quality")){
                                Nodes.add(new NodeQuality(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Resource")){
                                Nodes.add(new NodeResource(subactor.getString("id"),subactor.getString("text")));
                            }
                        }
                    }else{
                        Nodes.add(new Role(actor.getString("id"),actor.getString("text")));
                    }
                }
                if(actor.getString("type").equals("istar.Actor")){
                    if(actor.has("nodes")){
                        Nodes.add(new Actor(actor.getString("id"),actor.getString("text"),actor.getJSONArray("nodes")));
                        JSONArray submodel = new JSONArray();
                        JSONObject subactor = new JSONObject();
                        submodel = actor.getJSONArray("nodes");
                        for(int j =0;j<submodel.length();j++){
                            subactor = submodel.getJSONObject(j);
                            if(subactor.getString("type").equals("istar.Goal")){
                                Nodes.add(new NodeGoal(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Task")){
                                Nodes.add(new NodeTask(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Quality")){
                                Nodes.add(new NodeQuality(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Resource")){
                                Nodes.add(new NodeResource(subactor.getString("id"),subactor.getString("text")));
                            }
                        }
                    }else{
                        Nodes.add(new Actor(actor.getString("id"),actor.getString("text")));
                    }
                }
                if(actor.getString("type").equals("istar.Agent")){
                    if(actor.has("nodes")){
                        Nodes.add(new Agent(actor.getString("id"),actor.getString("text"),actor.getJSONArray("nodes")));
                        JSONArray submodel = new JSONArray();
                        JSONObject subactor = new JSONObject();
                        submodel = actor.getJSONArray("nodes");
                        for(int j =0;j<submodel.length();j++){
                            subactor = submodel.getJSONObject(j);
                            if(subactor.getString("type").equals("istar.Goal")){
                                Nodes.add(new NodeGoal(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Task")){
                                Nodes.add(new NodeTask(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Quality")){
                                Nodes.add(new NodeQuality(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Resource")){
                                Nodes.add(new NodeResource(subactor.getString("id"),subactor.getString("text")));
                            }
                        }
                    }else{
                        Nodes.add(new Agent(actor.getString("id"),actor.getString("text")));
                    }
                }
                if(actor.getString("type").equals("istar.Dependum")){
                    Nodes.add(new Dependum(actor.getString("id"),actor.getString("text")));
                }
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean loadLinks(JSONArray links,ArrayList<Relation> Relations){
        try{
            for(int i =0;i<links.length();i++){
                JSONObject link = new JSONObject();
                link = links.getJSONObject(i);
                //No se cargan los links de depenedencia por redunancia.
                /*if(link.get("type").equals("istar.DependencyLink")){
                    this.Relations.add(new Dependency(link.getString("id"),link.getString("source"), link.getString("target") ));
                }*/
                System.out.println(link.getString("type"));
                if(link.get("type").equals("istar.ContributionLink")){
                    Relations.add(new Contribution(link.getString("id"),link.getString("source"),link.getString("target"),link.getString("label")));
                }
                if(link.get("type").equals("istar.AndRefinementLink")){
                    Relations.add(new And(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
                if(link.get("type").equals("istar.OrRefinementLink")){
                    Relations.add(new Or(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
                if(link.get("type").equals("istar.istar.NeededByLink")){
                    Relations.add(new NeededBy(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
                if(link.get("type").equals("istar.istar.QualificationLink")){
                    Relations.add(new Qualification(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
                if(link.get("type").equals("istar.istar.ParticipatesInLink")){
                    Relations.add(new ParticipatesInLink(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
                if(link.get("type").equals("istar.istar.IsALink")){
                    Relations.add(new IsALink(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean loadDependencies(JSONArray dependencies,ArrayList<Relation> Relations){
        try{
            for(int i =0;i<dependencies.length();i++) {
                JSONObject dependencie = new JSONObject();
                dependencie = dependencies.getJSONObject(i);
                if(dependencie.get("type").equals("istar.Goal")){
                    Relations.add(new RelationGoal(dependencie.getString("id"),dependencie.getString("source"),dependencie.getString("target")));
                }
                if(dependencie.get("type").equals("istar.Quality")){
                    Relations.add(new RelationQuality(dependencie.getString("id"),dependencie.getString("source"),dependencie.getString("target")));
                }
                if(dependencie.get("type").equals("istar.Resource")){
                    Relations.add(new RelationResource(dependencie.getString("id"),dependencie.getString("source"),dependencie.getString("target")));
                }
                if(dependencie.get("type").equals("istar.Task")){
                    Relations.add(new RelationTask(dependencie.getString("id"),dependencie.getString("source"),dependencie.getString("target")));
                }

            }
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
