import Attractions.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttractionTest {

    Park park;
    Playground playground;
    Rollercoaster rollercoaster;
    Dodgems dodgems;

    @Before
    public void setup(){
        park = new Park("park");
        playground = new Playground("playground");
        rollercoaster = new Rollercoaster("rollercoaster");
        dodgems = new Dodgems("dodgems");
    }

    @Test
    public void hasName(){
        assertEquals("park", park.getName());
        assertEquals("playground", playground.getName());
        assertEquals("rollercoaster", rollercoaster.getName());
        assertEquals("dodgems", dodgems.getName());
    }

}
