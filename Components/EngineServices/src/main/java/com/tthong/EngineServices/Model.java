package com.tthong.EngineServices;

import com.fasterxml.jackson.annotation.JsonCreator;

import org.springframework.data.annotation.Id;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.hateoas.server.LinkBuilder;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Model {

    @Id private String id ;
    private String state;
    private String model;
    private String errors;

    public String getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors( String errors) {
        this.errors = errors;
    }

    @JsonCreator
    public Model(){
        this.state="Vanila";
        this.errors = "{'check':'False'}";
        this.model = null;

    }
    public Model(String id,String state,String errors,String model){
        this.id=id;
        this.state=state;
        this.errors = errors;
        this.model = model;

    }

}
