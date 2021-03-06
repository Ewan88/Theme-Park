package Attractions;

import Behaviours.ISecurity;
import Behaviours.IReviewed;
import ThemePark.Visitor;

public abstract class Attraction implements ISecurity, IReviewed {

    private String name;
    private int rating;

    public Attraction(String name){
        this.name = name;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isAllowed(Visitor visitor){
        return true;
    }

    public int getRating(){
        return this.rating;
    }

}
