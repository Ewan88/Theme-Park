import Attractions.*;
import Stalls.*;
import ThemePark.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor;
    Stall stall;
    Rollercoaster rollercoaster;
    Playground playground;

    @Before
    public void setup(){
        themePark = new ThemePark();
        playground = new Playground("Playground");
        rollercoaster = new Rollercoaster("rollerCoaster");
        visitor = new Visitor(22, 150, 0.0);
    }

    @Test
    public void canVisit(){
        assertTrue(themePark.visit(visitor, rollercoaster));
    }

    @Test
    public void cannotVisitRollercoaster(){
        Visitor youth = new Visitor(13, 130, 0.0);
        assertFalse(themePark.visit(youth, rollercoaster));
    }

    @Test
    public void cannotVisitPlayground(){
        assertFalse(themePark.visit(visitor, playground));
    }



}
