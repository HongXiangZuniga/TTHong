package com.tthong.EngineServices;

public class Steps {

    public String next(String step){
        if(step.equals("Vanilla"))
            return "Validator I";
        if(step.equals("I Validated"))
            return "I2AC";
        if(step.equals("AC Transformated"))
            return "Validator AC";
        if(step.equals("AC Validated"))
            return "AC2OOM";
        if(step.equals("OOM Transformated"))
            return "Validator OOM";
        if(step.equals("OOM Validated"))
            return "Finish";
        return "Finish";
    }
}
