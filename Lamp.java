public class Lamp extends ArtificialLight{
    public static int getQuantity() {
        return counter;
    }

    public static int counter = 1;
    public Lamp(String sourceName, int brightnessLevel, boolean isTurnedOn, int counter) {
        super(sourceName, 100, isTurnedOn);
        this.counter = counter;
    }


}
