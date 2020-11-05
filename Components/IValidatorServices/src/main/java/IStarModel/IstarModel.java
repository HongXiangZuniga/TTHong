package IStarModel;

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
import IStarModel.Adapters.pistartool;
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
        pistartool adapter = new pistartool();
        return adapter.loadActors(actors,getNodes());
    }
    public boolean loadLinks(JSONArray links){
        pistartool adapter = new pistartool();
        return adapter.loadLinks(links,getRelations());
    }
    public boolean loadDependencies(JSONArray dependencies){
        pistartool adapter = new pistartool();
        return adapter.loadDependencies(dependencies,getRelations());
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
            if (loadLinks(links) == false) {
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
            if (loadDependencies(dependencies) == false) {
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
