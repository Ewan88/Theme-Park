package Stalls;

import Behaviours.ISecurity;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name){
        super(name);
    }

    public boolean isAllowed(Visitor visitor){
        if (visitor.getAge() >= 18){
            return true;
        } else return false;
    }



}
