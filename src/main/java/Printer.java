public class Printer {
    private int numSheets = 0;
    private int tonerVolume = 0;

    public Printer() {
    }

    public int getNumSheets() {
        return this.numSheets;
    }

    public void setNumSheets(int newSheets) {
        this.numSheets = newSheets;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public void setTonerVolume(int newPageYield) {
        this.tonerVolume += newPageYield;
    }

    public void print(int pages, int copies) {
        int printingQueue = pages * copies;
        if (numSheets >= printingQueue) {
            this.numSheets -= printingQueue;
        }
    }

    public void refill(int newSheets) {
        this.numSheets += newSheets;
    }

}
