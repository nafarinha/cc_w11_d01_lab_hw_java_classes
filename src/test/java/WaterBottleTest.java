import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void getVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink() {

       for (int i = 0; i < 10; i++) {
           waterBottle.drink();
       }
        assertEquals(0, waterBottle.getVolume());
    }
}
