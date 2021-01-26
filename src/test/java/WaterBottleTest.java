import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canTakeDrink(){
        assertEquals(90, waterbottle.takeDrink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterbottle .Empty());
    }

    @Test
    public void canFill(){
        assertEquals(100, waterbottle.Fill());
    }



}
