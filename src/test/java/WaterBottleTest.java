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
}
