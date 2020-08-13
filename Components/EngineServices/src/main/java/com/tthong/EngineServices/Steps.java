package com.tthong.EngineServices;

public class Steps {

    public String next(String step){
        if(step.equals("Vanilla"))
            return "IStar Validated";
        if(step.equals("IStar Validated"))
            return "Finish";
        /*if(step.equals("AC Transformated"))
            return "AC Validated";
        if(step.equals("AC Validated"))
            return "OOM Transformated";
        if(step.equals("OOM Transformated"))
            return "OOM Validated";
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
