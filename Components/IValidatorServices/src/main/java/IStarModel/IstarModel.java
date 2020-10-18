package IStarModel;

import CommonModel.Node;
import CommonModel.Relation;
import IStarModel.ALLNodes.Nodes.Nodes.Actor;
import IStarModel.ALLNodes.Nodes.Nodes.Agent;
import IStarModel.ALLNodes.Nodes.Nodes.Dependum;
import IStarModel.ALLNodes.Nodes.Nodes.Role;
import IStarModel.ALLNodes.Nodes.NodesDependencies.NodeGoal;
import IStarModel.ALLNodes.Nodes.NodesDependencies.NodeQuality;
import IStarModel.ALLNodes.Nodes.NodesDependencies.NodeResource;
import IStarModel.ALLNodes.Nodes.NodesDependencies.NodeTask;
import IStarModel.ALLRelations.RelationsDependencies.RelationGoal;
import IStarModel.ALLRelations.RelationsDependencies.RelationQuality;
import IStarModel.ALLRelations.RelationsDependencies.RelationResource;
import IStarModel.ALLRelations.RelationsDependencies.RelationTask;
import IStarModel.ALLRelations.ActorLinks.IsALink;
import IStarModel.ALLRelations.ActorLinks.ParticipatesInLink;
import IStarModel.ALLRelations.Relations.Contribution;
import IStarModel.ALLRelations.Relations.And;
import IStarModel.ALLRelations.Relations.NeededBy;
import IStarModel.ALLRelations.Relations.Or;
import IStarModel.ALLRelations.Relations.Qualification;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class IstarModel   {

    private ArrayList<ArrayList<String>> Errors = new ArrayList<>();
    public Boolean Validate = true;
    public ArrayList<Relation> Relations = new ArrayList();
    public ArrayList<Node> Nodes = new ArrayList();
    public boolean loadActors(JSONArray actors){
        try{
            /*Cargando Actores */
            for(int i =0;i<actors.length();i++){
                JSONObject actor = new JSONObject();
                actor = actors.getJSONObject(i);
                if(actor.getString("type").equals("istar.Role")){
                    if(actor.has("nodes")){
                        this.Nodes.add(new Role(actor.getString("id"),actor.getString("text"),actor.getJSONArray("nodes")));
                        JSONArray submodel = new JSONArray();
                        JSONObject subactor = new JSONObject();
                        submodel = actor.getJSONArray("nodes");
                        for(int j =0;j<submodel.length();j++){
                            subactor = submodel.getJSONObject(j);
                            if(subactor.getString("type").equals("istar.Goal")){
                                this.Nodes.add(new NodeGoal(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Task")){
                                this.Nodes.add(new NodeTask(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Quality")){
                                this.Nodes.add(new NodeQuality(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Resource")){
                                this.Nodes.add(new NodeResource(subactor.getString("id"),subactor.getString("text")));
                            }
                        }
                    }else{
                        this.Nodes.add(new Role(actor.getString("id"),actor.getString("text")));
                    }
                }
                if(actor.getString("type").equals("istar.Actor")){
                    if(actor.has("nodes")){
                        this.Nodes.add(new Actor(actor.getString("id"),actor.getString("text"),actor.getJSONArray("nodes")));
                        JSONArray submodel = new JSONArray();
                        JSONObject subactor = new JSONObject();
                        submodel = actor.getJSONArray("nodes");
                        for(int j =0;j<submodel.length();j++){
                            subactor = submodel.getJSONObject(j);
                            if(subactor.getString("type").equals("istar.Goal")){
                                this.Nodes.add(new NodeGoal(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Task")){
                                this.Nodes.add(new NodeTask(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Quality")){
                                this.Nodes.add(new NodeQuality(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Resource")){
                                this.Nodes.add(new NodeResource(subactor.getString("id"),subactor.getString("text")));
                            }
                        }
                    }else{
                        this.Nodes.add(new Actor(actor.getString("id"),actor.getString("text")));
                    }
                }
                if(actor.getString("type").equals("istar.Agent")){
                    if(actor.has("nodes")){
                        this.Nodes.add(new Agent(actor.getString("id"),actor.getString("text"),actor.getJSONArray("nodes")));
                        JSONArray submodel = new JSONArray();
                        JSONObject subactor = new JSONObject();
                        submodel = actor.getJSONArray("nodes");
                        for(int j =0;j<submodel.length();j++){
                            subactor = submodel.getJSONObject(j);
                            if(subactor.getString("type").equals("istar.Goal")){
                                this.Nodes.add(new NodeGoal(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Task")){
                                this.Nodes.add(new NodeTask(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Quality")){
                                this.Nodes.add(new NodeQuality(subactor.getString("id"),subactor.getString("text")));
                            }
                            if(subactor.getString("type").equals("istar.Resource")){
                                this.Nodes.add(new NodeResource(subactor.getString("id"),subactor.getString("text")));
                            }
                        }
                    }else{
                        this.Nodes.add(new Agent(actor.getString("id"),actor.getString("text")));
                    }
                }
                if(actor.getString("type").equals("istar.Dependum")){
                    this.Nodes.add(new Dependum(actor.getString("id"),actor.getString("text")));
                }
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean loadLinks(JSONArray links){
        try{
            for(int i =0;i<links.length();i++){
                JSONObject link = new JSONObject();
                link = links.getJSONObject(i);
                /*if(link.get("type").equals("istar.DependencyLink")){
                    this.Relations.add(new Dependency(link.getString("id"),link.getString("source"), link.getString("target") ));
                }*/
                if(link.get("type").equals("istar.ContributionLink")){
                    this.Relations.add(new Contribution(link.getString("id"),link.getString("source"),link.getString("target"),link.getString("label")));
                }
                if(link.get("type").equals("istar.AndRefinementLink")){
                    this.Relations.add(new And(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
                if(link.get("type").equals("istar.OrRefinementLink")){
                    this.Relations.add(new Or(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
                if(link.get("type").equals("istar.istar.NeededByLink")){
                    this.Relations.add(new NeededBy(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
                if(link.get("type").equals("istar.istar.QualificationLink")){
                    this.Relations.add(new Qualification(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
                if(link.get("type").equals("istar.istar.ParticipatesInLink")){
                    this.Relations.add(new ParticipatesInLink(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
                if(link.get("type").equals("istar.istar.IsALink")){
                    this.Relations.add(new IsALink(link.getString("id"),link.getString("source"), link.getString("target") ));
                }
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean loadDependencies(JSONArray dependencies){
    try{
        for(int i =0;i<dependencies.length();i++) {
            JSONObject dependencie = new JSONObject();
            dependencie = dependencies.getJSONObject(i);
            if(dependencie.get("type").equals("istar.Goal")){
                this.Relations.add(new RelationGoal(dependencie.getString("id"),dependencie.getString("source"),dependencie.getString("target")));
            }
            if(dependencie.get("type").equals("istar.Quality")){
                this.Relations.add(new RelationQuality(dependencie.getString("id"),dependencie.getString("source"),dependencie.getString("target")));
            }
            if(dependencie.get("type").equals("istar.Resource")){
                this.Relations.add(new RelationResource(dependencie.getString("id"),dependencie.getString("source"),dependencie.getString("target")));
            }
            if(dependencie.get("type").equals("istar.Task")){
                this.Relations.add(new RelationTask(dependencie.getString("id"),dependencie.getString("source"),dependencie.getString("target")));
            }

        }
        return true;
    }catch(Exception e){
        return false;
    }
    }



    public void load(JSONArray actors,JSONArray links,JSONArray dependencies) throws JSONException {
        try {
            if (loadActors(actors) == false) {
                ArrayList<String> Error = null;
                Error.add("ErrrorLoad");
                Error.add("Actors");
                Errors.add(Error);
            }
        }catch (Exception e) {
            ArrayList<String> Error = null;
            Error.add("ErrrorLoad");
            Error.add("Actors");
            Errors.add(Error);
        }
        try {
            if (loadLinks(actors) == false) {
                ArrayList<String> Error = null;
                Error.add("ErrrorLoad");
                Error.add("LinksS");
                Errors.add(Error);
            }
        }catch (Exception e) {
            ArrayList<String> Error = null;
            Error.add("ErrrorLoad");
            Error.add("Links");
            Errors.add(Error);
        }
        try {
            if (loadDependencies(actors) == false) {
                ArrayList<String> Error = null;
                Error.add("ErrrorLoad");
                Error.add("Dependencies");
                Errors.add(Error);
            }
        }catch (Exception e) {
            ArrayList<String> Error = null;
            Error.add("ErrrorLoad");
            Error.add("Dependencies");
            Errors.add(Error);
        }



    }


    public void GeneralValidate(){
        SingeValidate();
        RelationValidate();
    }

    //Validacion del elemento por si mismo
    public void SingeValidate(){

        for(int i=0; i < this.Nodes.size();i++){
            if(this.Nodes.get(i).isValid()==false){
                ArrayList<String> Error = new ArrayList<>();
                Error.add("NodeError");
                Error.add(this.Nodes.get(0).getId());
                Errors.add(Error);
            }
        }

        for(int i=0; i < this.Relations.size();i++){
            if(this.Relations.get(i).isValid()==false){
                ArrayList<String> Error = new ArrayList<>();
                Error.add("ErrorRelations");
                Error.add(this.Relations.get(0).getId());
                Errors.add(Error);
            }
        }
    }

    //Validacion de las Relaciones
    public void RelationValidate(){
        Rules rules = new Rules();
        boolean response = true;
        for(int i=0;i<rules.rules.size();i++){
            response = rules.rules.get(i).run(Nodes,Relations,Errors);
        }
    }

    public ArrayList<ArrayList<String>> getErrors() {
        return Errors;
    }

    public void setErrors(ArrayList<ArrayList<String>> errors) {
        Errors = errors;
    }

    public Boolean getValidate() {
        return Validate;
    }

    public void setValidate(Boolean validate) {
        Validate = validate;
    }

    public ArrayList<Relation> getRelations() {
        return Relations;
    }

    public void setRelations(ArrayList<Relation> relations) {
        Relations = relations;
    }

    public ArrayList<Node> getNodes() {
        return Nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        Nodes = nodes;
    }
}
