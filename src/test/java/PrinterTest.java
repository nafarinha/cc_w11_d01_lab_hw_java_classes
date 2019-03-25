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
}
