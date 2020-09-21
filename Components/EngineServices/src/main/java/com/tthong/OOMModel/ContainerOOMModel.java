package com.tthong.OOMModel;

import com.tthong.GeneralModel.CommonModel;

import java.util.ArrayList;

public class ContainerOOMModel extends CommonModel {

    public OOMModel model;


    public ContainerOOMModel() {
        this.model = new OOMModel();
    }

    public ContainerOOMModel(String date, ArrayList<String> validator,OOMModel oomModel) {
        super(date,validator);
        this.model = oomModel;
    }




}
