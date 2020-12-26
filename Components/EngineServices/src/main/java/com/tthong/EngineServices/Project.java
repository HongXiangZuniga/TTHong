package com.tthong.EngineServices;

import ACModel.containerAC;
import IModel.containerI;
import OOMModel.containerOOM;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.util.JSONPObject;

import org.springframework.data.annotation.Id;

import net.minidev.json.JSONObject;


public class Project {

    @Id
    public String id ;
    private String state;
    private containerI model_i;
    private containerAC model_AC;
    private containerOOM model_OOM;


    public void setId(String id) {
        this.id = id;
    }

    public containerI getModel_i() {
        return model_i;
    }

    public void setModel_i(containerI model_i) {
        this.model_i = model_i;
    }

    public containerAC getModel_AC() {
        return model_AC;
    }

    public void setModel_AC(containerAC model_AC) {
        this.model_AC = model_AC;
    }

    public containerOOM getModel_OOM() {
        return model_OOM;
    }

    public void setModel_OOM(containerOOM model_OOM) {
        this.model_OOM = model_OOM;
    }

    @JsonCreator
    public Project() {
        this.state = "Vanilla";
        this.model_i = new containerI();
        this.model_AC = new containerAC();
        this.model_OOM = new containerOOM();

    }


}
