public class WaterBottle {

    private int volume = 100;

    public WaterBottle() {
    };

    public int getVolume() {
        return this.volume;
    }

    public void drink() {
        if (this.volume > 0) {
            this.volume -= 10;
        }
    }
}
