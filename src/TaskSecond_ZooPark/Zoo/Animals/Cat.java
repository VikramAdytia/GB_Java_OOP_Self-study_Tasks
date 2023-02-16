package TaskSecond_ZooPark.Zoo.Animals;

public class Cat extends Predators implements AbleToRun,AbleToSwim,HasVocal {
    public Cat(String name) {
        super(name);
    }



    @Override
    public int runningSpeed() {
        return 25;
    }

    @Override
    public int swimmingSpeed() {
        return 5;
    }

    @Override
    public String sound() {
        return "meow";
    }

    @Override
    public String toString() {
        return " Its a Cat " + super.toString()
                + " saying " + sound() + " eating "+ fourage() +
                " running " + runningSpeed() + " tgdk/s "
                + " swimming " + swimmingSpeed() + " psch/s "
                ;
    }

}
