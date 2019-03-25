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

//    @Test
//    public void print() {
//        printer.setNumSheets(500);
//        printer.print(2,5);
//        assertEquals(490, printer.getNumSheets());
//    }

    //refactored test for print fn to cater for toner volume
    @Test
    public void print() {
        printer.setNumSheets(100);
        printer.setTonerVolume(150);
        printer.print(45, 2);
        assertEquals(10, printer.getNumSheets());
        assertEquals(60, printer.getTonerVolume());
    }

    @Test
    public void printNotEnoughSheets() {
        printer.setNumSheets(100);
        printer.setTonerVolume(200);
        printer.print(50, 5);
        assertEquals(100, printer.getNumSheets());
    }

    @Test
    public void printNotEnoughToner() {
        printer.setNumSheets(500);
        printer.setTonerVolume(200);
        printer.print(50, 5);
        assertEquals(200, printer.getTonerVolume());
    }

    @Test
    public void refill() {
        printer.setNumSheets(120);
        printer.refill(200);
        assertEquals(320, printer.getNumSheets());
    }

    @Test
    public void getTonerVolume() {
        assertEquals(0, printer.getTonerVolume());
    }

    @Test
    public void setTonerVolume() {
        printer.setTonerVolume(1000);
        assertEquals(1000, printer.getTonerVolume());
    }

}
