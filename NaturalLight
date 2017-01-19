public abstract class NaturalLight implements SourceOfLight{
    protected boolean isTurnedOn;
    protected String sourceName;
    protected String action;
    protected int brightnessLevel;
    public NaturalLight(boolean isTurnedOn, String sourceName, String action, int brightnessLevel) {
        this.isTurnedOn = isTurnedOn;
        this.sourceName = sourceName;
        this.brightnessLevel = brightnessLevel;
    }

    @Override
    public void turnOn(){
        isTurnedOn = true;
        System.out.println("You have used your magic." + sourceName + " has been turned on");
    }

    @Override
    public void turnOff(){
        isTurnedOn = false;
        System.out.println("You have used your magic. " + sourceName + " has been turned off");
    }

    @Override
    public void increaseBrightness(){
        if(isTurnedOn) {
            brightnessLevel += 25;
            System.out.println("You have used your magic." + sourceName + "'s brightness has been increased. " +
                    "Now brightness level is " + brightnessLevel + "%");
        }else{
            System.out.println("Your magic hasn't worked. Maybe the source is turned off");
        }
    }

    @Override
    public void reduceBrightness(){
        if(isTurnedOn) {
            brightnessLevel -= 25;
            System.out.println("You have used your magic. " + sourceName + "'s brightness has been reduced. Now brightness level is " + brightnessLevel + "%");
        }else{
            System.out.println("Your magic hasn't worked. Maybe the source is turned off");
        }
    }

}
