package com.tthong.IModel;

import com.tthong.GeneralModel.GeneralModel;

import java.util.ArrayList;

public class IModel extends GeneralModel {

    public SubIModel model;

    public SubIModel getModel() {
        return model;
    }

    public void setModel(SubIModel model) {
        this.model = model;
    }

    public IModel() {
        this.model  = new SubIModel();
    }

    public IModel(SubIModel model) {
        this.model = model;
    }

    public IModel(String date, ArrayList<String> validator, SubIModel model) {
        super(date, validator);
        this.model = model;

    }
}
