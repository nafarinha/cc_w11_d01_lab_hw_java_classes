public class Printer {
    private int numSheets = 0;

    public Printer() {
    }

    public int getNumSheets() {
        return this.numSheets;
    }

    public void setNumSheets(int newSheets) {
        this.numSheets = newSheets;
    }

    public void print(int pages, int copies) {
        int printingQueue = pages * copies;
        if (numSheets >= printingQueue) {
            this.numSheets -= printingQueue;
        }
    }

}
