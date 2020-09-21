package com.tthong.ACModel;

import com.tthong.GeneralModel.CommonModel;

import java.util.ArrayList;

public class ContainerACModel extends CommonModel {

    public ACModel model = new ACModel();

    public ACModel getModel() {
        return model;
    }

    public void setModel(ACModel model) {
        this.model = model;
    }

    public ContainerACModel() {

    }
    public ContainerACModel(String date, ArrayList<String> validator,ACModel model) {
        super(date, validator);
        this.model = model;
    }
}
