package TaskSecond_ZooPark.Zoo.Animals;

public class Dog extends Predators implements AbleToRun,AbleToSwim,HasVocal {
    public Dog(String name) {
        super(name);
    }



    @Override
    public int runningSpeed() {
        return 20;
    }

    @Override
    public int swimmingSpeed() {
        return 10;
    }

    @Override
    public String sound() {
        return "bark";
    }

    @Override
    public String toString() {
        return " Its a Dog " + super.toString()
                + " saying " + sound() + " eating "+ fourage() +
                " running " + runningSpeed() + " tgdk/s "
                + " swimming " + swimmingSpeed() + " psch/s "
                ;
    }
}
