public class Fire extends NaturalLight{
    public Fire(boolean isTurnedOn, String sourceName) {
        super(isTurnedOn, sourceName, isTurnedOn?"burns":"isn't burns", 100);
    }

    @Override
    public void turnOn(){
        isTurnedOn = true;
        System.out.println("You have used your magic. " + sourceName + " is burning");
    }

    @Override
    public void turnOff(){
        isTurnedOn = false;
        System.out.println("You have used your magic. " + sourceName + " has extinguished");
    }
}
