package com.tthong.GeneralModel;

import java.util.ArrayList;
import java.util.Date;

public class CommonModel {

    private String date;
    private ArrayList<String> validator;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getValidator() {
        return validator;
    }

    public void setValidator(ArrayList<String> validator) {
        this.validator = validator;
    }

    public CommonModel(){
        Date date = new Date();
        this.date = date.toString();
        this.validator = new ArrayList<>();

    }

    public CommonModel(String date, ArrayList<String> validator) {
        this.date = date;
        this.validator = validator;
    }
}
