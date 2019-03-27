import Stalls.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StallTest {

    IceCreamStall iceCreamStall;
    CandyFlossStall candyFlossStall;
    TobaccoStall tobaccoStall;

    @Before
    public void setup(){
        iceCreamStall = new IceCreamStall("Ice Cream");
        candyFlossStall = new CandyFlossStall("Candy Floss");
        tobaccoStall = new TobaccoStall("Tobacco");
    }

    @Test
    public void hasName(){
        assertEquals("Ice Cream", iceCreamStall.getName());
        assertEquals("Candy Floss", candyFlossStall.getName());
        assertEquals("Tobacco", tobaccoStall.getName());
    }

}
