package com.tthong.EngineServices;

public class Steps {

    public String next(String step){
        if(step.equals("Vanilla"))
            return "I Validator";
        if(step.equals("I Validated"))
            return "Finish";
        /*if(step.equals("AC Transformated"))
            return "AC Validator";
        if(step.equals("AC Validated"))
            return "AC2OOM";
        if(step.equals("OOM Transformated"))
            return "OOM Validator";
        if(step.equals("OOM Validated"))
            return "Finish";*/
        return "Error";
    }


    public String update(String step){
        if(step.equals("Vanilla"))
            return ("I Validated");
        return "Finish";
    }
}
