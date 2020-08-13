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
    public ContainerIStarModel IModel;
    public ContainerACModel ACModel;
    public ContainerOOMModel OOModel;


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
        this.IModel = new ContainerIStarModel();
        this.ACModel = new ContainerACModel();
        this.OOModel = new ContainerOOMModel();
    }

    public Project(String id, ContainerIStarModel IModel) {
        this.id = id;
        this.IModel = IModel;
        this.ACModel = new ContainerACModel();
        this.OOModel = new ContainerOOMModel();
    }
}
