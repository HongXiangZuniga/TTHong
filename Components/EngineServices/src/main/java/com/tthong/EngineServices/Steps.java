package com.tthong.EngineServices;

public class Steps {

    public String next(String step){
        if(step.equals("Vanilla"))
            return "IStarValidated";
        if(step.equals("IStarValidated"))
            return "ACTransformate";
        if(step.equals("ACTransformated"))
            return "ACValidated";
        if(step.equals("ACValidated"))
            return "OOMTransformated";
        if(step.equals("OOMTransformated"))
            return "OOMValidated";
        if(step.equals("OOMValidated"))
            return "Finish";
        if(step.equals("Finish"))
            return "Finish";
        return "Error";
    }
}
