package Stalls;

import Behaviours.IReviewed;

public abstract class Stall implements IReviewed {

    String name;
    int rating;

    public Stall(String name){
        this.name = name;
        this.rating = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }

}
