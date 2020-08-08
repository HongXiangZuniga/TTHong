package com.tthong.EngineServices;

public class Steps {

    public String next(String step){
        if(step.equals("Vanilla"))
            return "Validator I";
        if(step.equals("Validator I"))
            return "I2AC";
        if(step.equals("I2AC"))
            return "Validator AC";
        if(step.equals("Validator AC"))
            return "AC2OOM";
        if(step.equals("AC2OOM"))
            return "Validator OOM";
        if(step.equals("Validator OOM"))
            return "Finish";
        return "Finish";
    }
}
