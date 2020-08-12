package com.tthong.ACModel;

import com.tthong.GeneralModel.CommonModel;

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
    public ContainerACModel(ACModel model) {
        this.model = model;
    }
}
