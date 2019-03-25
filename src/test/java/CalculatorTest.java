import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        this.calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(3, calculator.add(1,2), 0.01);
    }

    @Test
    public void substract() {
        assertEquals(-1, calculator.subtract(1, 2), 0.01);
    }

    @Test
    public void multiply() {
        assertEquals(15, calculator.multiply(3,5), 0.01);
    }
}
