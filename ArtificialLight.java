public class Lamp extends ArtificialLight{
    public int getQuantity() {
        return counter;
    }

    private int counter = 0;
    public Lamp(String sourceName, int brightnessLevel, boolean isTurnedOn, int counter) {
        super(sourceName, 100, isTurnedOn);
        this.counter = counter;
    }


}
