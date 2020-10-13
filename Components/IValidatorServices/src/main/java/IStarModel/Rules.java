package IStarModel;

import IStarModel.Constrains.Class.Rule;
import IStarModel.Constrains.Rules.*;
import IStarModel.Constrains.Rules.r1;
import IStarModel.Constrains.Rules.r2;
import IStarModel.Constrains.Rules.r3;


import java.util.ArrayList;

public class Rules {

    public ArrayList<Rule>rules = new ArrayList<>();


    public Rules() {
        rules.add(new r1());
        rules.add(new r2());
        rules.add(new r3());
    }
}
