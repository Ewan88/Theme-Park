package ThemePark;

import Attractions.*;
import Behaviours.*;
import Stalls.*;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Visitor> visitors;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.visitors = new ArrayList<Visitor>();
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();

        Park park = new Park("Park");
        Dodgems dodgems = new Dodgems("Dodgems");
        Playground playground = new Playground("Playground");
        Rollercoaster rollercoaster = new Rollercoaster("Rollercoaster");

        CandyFlossStall candyFlossStall = new CandyFlossStall("Candy Floss");
        IceCreamStall iceCreamStall = new IceCreamStall("Ice Cream");
        TobaccoStall tobaccoStall = new TobaccoStall("Tobacco");

        attractions.add(park);
        attractions.add(dodgems);
        attractions.add(playground);
        attractions.add(rollercoaster);

        stalls.add(candyFlossStall);
        stalls.add(iceCreamStall);
        stalls.add(tobaccoStall);
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public boolean visit(Visitor visitor, ISecurity attraction){
        return attraction.isAllowed(visitor);
    }

}
