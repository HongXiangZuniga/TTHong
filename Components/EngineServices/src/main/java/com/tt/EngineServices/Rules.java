package com.tt.EngineServices;

public class Rules {


    public String next(String state){
        if(state.equals("vanila")){
            return "validator";
        }
        if(state.equals("validator")){
            return "transformated";
        }
        if(state.equals("transformated")){
            return "finished";
        }
        return "error";
    }
}
