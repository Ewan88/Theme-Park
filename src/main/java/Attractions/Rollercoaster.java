package Attractions;

import Behaviours.IReviewed;
import Behaviours.ISecurity;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, IReviewed {


    public Rollercoaster(String name){
        super(name);
    }

    @Override
    public boolean isAllowed(Visitor visitor){
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        } else {
            return false;
        }
    }

}
