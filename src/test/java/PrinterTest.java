import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void getNumSheets() {
        assertEquals(0, printer.getNumSheets());
    }

    @Test
    public void setNumSheets() {
        printer.setNumSheets(200);
        assertEquals(200, printer.getNumSheets());
    }

    @Test
    public void print() {
        printer.setNumSheets(500);
        printer.print(2,5);
        assertEquals(490, printer.getNumSheets());
    }

    @Test
    public void refill() {
        printer.setNumSheets(120);
        printer.refill(200);
        assertEquals(320, printer.getNumSheets());
    }
}
