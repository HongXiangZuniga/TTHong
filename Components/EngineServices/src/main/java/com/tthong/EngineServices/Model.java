package com.tthong.EngineServices;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.tthong.IModel.IModel;
import com.tthong.ACModel.ACModel;
import com.tthong.OOMModel.OOMModel;
import org.springframework.data.annotation.Id;


public class Model {

    @Id
    public String id ;
    private String state;
    public IModel IModel;
    public ACModel ACModel;
    public OOMModel OOMModel;




    public String now(){
        return this.state;
    }

    public String getId() {
        return id;
    }

    @JsonCreator
    public Model() {
        this.state = "Vanilla";
        this.IModel = new IModel();
        this.ACModel = new ACModel();
        this.OOMModel = new OOMModel();
    }

    public Model(String id, com.tthong.IModel.IModel IModel) {
        this.id = id;
        this.IModel = IModel;
        this.ACModel = new ACModel();
        this.OOMModel = new OOMModel();
    }
}
