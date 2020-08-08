package com.tthong.ACModel;

import com.tthong.GeneralModel.GeneralModel;

public class ACModel extends GeneralModel {

    public SubACModel model = new SubACModel();

    public SubACModel getModel() {
        return model;
    }

    public void setModel(SubACModel model) {
        this.model = model;
    }

    public ACModel() {

    }
    public ACModel(SubACModel model) {
        this.model = model;
    }
}
