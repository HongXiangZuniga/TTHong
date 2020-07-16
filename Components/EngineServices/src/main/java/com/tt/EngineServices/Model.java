package com.tt.EngineServices;

import org.springframework.hateoas.RepresentationModel;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Model extends RepresentationModel<Model>{
    private  String id;
    private  String model;
    private  String state;

    @JsonCreator
    public Model (@JsonProperty("id")String id,
                  @JsonProperty("state")String state,
                  @JsonProperty("model")String model){
        this.id = id;
        this.model = model;
        this.state = state;


    }
    public String getContent() {
		return state;
    }

}