package com.tthong.IModel;

import com.tthong.GeneralModel.CommonModel;

import java.util.ArrayList;

public class ContainerIStarModel extends CommonModel {

    public IStarModel model;

    public IStarModel getModel() {
        return model;
    }

    public void setModel(IStarModel model) {
        this.model = model;
    }

    public ContainerIStarModel() {
        this.model  = new IStarModel();
    }

    public ContainerIStarModel(IStarModel model) {
        this.model = model;
    }

    public ContainerIStarModel(String date, ArrayList<String> validator, IStarModel model) {
        super(date, validator);
        this.model = model;

    }
}
