import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setup(){
        visitor = new Visitor(22, 150, 5.50);
    }

    @Test
    public void hasAge(){
        assertEquals(22, visitor.getAge());
    }

    @Test
    public void hasName(){
        assertEquals(150, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(5.50, visitor.getMoney(), 0.0);
    }

}
