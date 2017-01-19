public class Flashlight extends Lamp {
    public Flashlight(String sourceName, int brightnessLevel, boolean isTurnedOn, int counter) {
        super(sourceName, 100, isTurnedOn, counter);
    }
    @Override
    public void increaseBrightness(){
        if(isTurnedOn) {
            brightnessLevel += 10;
            System.out.println(sourceName + "'s brightness has been increased. " +
                    "Now brightness level is " + brightnessLevel + "%");
        }else{
            System.out.println(sourceName + "'s brightness hasn't been increased. Maybe the source is turned off");
        }
    }
}
