package com.tt.EngineServices;

import org.springframework.hateoas.RepresentationModel;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Model extends RepresentationModel<Model>{
    private  String id;
    private  String model;
    private  String state;

    @JsonCreator
    public Model (@JsonProperty("state")String state){
        this.state = state;
    }
    public String getContent() {
		return state;
    }
    
    public Model(String state,String id,String model){
        this.model = model;
        this.state = state;
        this.id = id;
    }
    
}