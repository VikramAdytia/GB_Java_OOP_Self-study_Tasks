package TaskSecond_ZooPark.Zoo.Animals;

public class Tulpa extends Animal implements AbleToRun, AbleToSwim,AbleToFly,HasVocal{
    public Tulpa(String name) {
        super(name);
    }

    @Override
    public int flyingSpeed() {
        return 0;
    }

    @Override
    public int runningSpeed() {
        return 0;
    }

    @Override
    public int swimmingSpeed() {
        return 0;
    }

    @Override
    public String fourage() {
        return "null";
    }

    @Override
    public String sound() {
        return "null";
    }
}
