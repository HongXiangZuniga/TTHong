package Transform;

import ACModel.ACModel;
import IStarModel.IstarModel;
import Transform.rules.*;

import java.util.ArrayList;

public class Transform {
    public ArrayList<Rule> rules = new ArrayList<Rule>();


    public void run(IstarModel IS, ACModel AC) {
    for(int i =0;i<this.rules.size();i++){
        System.out.println("run: r"+(i+1));
        this.rules.get(i).run(IS,AC);

    }

    }

    public Transform() {
        this.rules.add(new R1());
        this.rules.add(new R2());
        this.rules.add(new R3());
        this.rules.add(new R4());
        //this.rules.add(new R5());
    }
}