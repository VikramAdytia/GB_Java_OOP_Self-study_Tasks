package TaskSecond_ZooPark.Zoo.Animals;

public class Duck extends Herbivores implements AbleToFly,AbleToRun,AbleToSwim,HasVocal {
    public Duck(String name) {
        super(name);
    }



    @Override
    public int runningSpeed() {
        return 15;
    }

    @Override
    public int swimmingSpeed() {
        return 15;
    }

    @Override
    public int flyingSpeed() { return  15; }



    @Override
    public String sound() {
        return "quack";
    }

    @Override
    public String toString() {
        return " Its a Duck " + super.toString()
                + " saying " + sound() + " eating "+ fourage() +
                " running " + runningSpeed() + " tgdk/s "
                + " swimming " + swimmingSpeed() + " psch/s "
                + " flying " + flyingSpeed() + " byak/s "
                ;
    }
}
