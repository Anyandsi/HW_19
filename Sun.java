public class Sun extends NaturalLight {

    public Sun(boolean isTurnedOn, String sourceName) {
        super(isTurnedOn, sourceName, isTurnedOn? "shining": "isn't shining", 100);
    }

    @Override
    public void turnOn(){
        isTurnedOn = true;
        System.out.println("You have used your magic. Morning has come");
    }

    @Override
    public void turnOff(){
        isTurnedOn = false;
        System.out.println("You have used your magic. Night has come");
    }

}
