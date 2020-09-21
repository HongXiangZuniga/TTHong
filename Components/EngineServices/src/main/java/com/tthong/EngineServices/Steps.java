package com.tthong.EngineServices;

public class Steps {

    public String next(String step){
        if(step.equals("Vanilla"))
            return "IStarValidated";
        if(step.equals("IStarValidated"))
            return "IStar2AC";
        if(step.equals("IStar2AC"))
            return "ACValidated";
        if(step.equals("ACValidated"))
            return "AC2OOM";
        if(step.equals("AC2OOM"))
            return "OOMValidated";
        if(step.equals("OOMValidated"))
            return "Finish";
        if(step.equals("Finish"))
            return "Finish";
        return "Error";
    }
}
