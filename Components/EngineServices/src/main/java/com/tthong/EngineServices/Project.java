package com.tthong.EngineServices;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.tthong.IModel.ContainerIStarModel;
import com.tthong.ACModel.ContainerACModel;
import com.tthong.OOMModel.ContainerOOMModel;
import org.springframework.data.annotation.Id;


public class Project {

    @Id
    public String id ;
    private String state;
    public ContainerIStarModel model_i;
    public ContainerACModel model_AC;
    public ContainerOOMModel model_OOM;


    public void setState(String state){
        this.state = state;
    }

    public String now(){
        return this.state;
    }

    public String getId() {
        return id;
    }

    @JsonCreator
    public Project() {
        this.state = "Vanilla";
        this.model_i = new ContainerIStarModel();
        this.model_AC = new ContainerACModel();
        this.model_OOM = new ContainerOOMModel();
    }

    public Project(String id, ContainerIStarModel IModel,ContainerACModel ACModel,ContainerOOMModel OOModel) {
        this.id = id;
        this.model_i = IModel;
        this.model_AC = ACModel;
        this.model_OOM = OOModel;
    }
}
