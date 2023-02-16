package TaskSecond_ZooPark.Zoo.Animals;

public class Crab extends Predators implements AbleToSwim,AbleToRun{
    public Crab(String name) { super(name);   }

    @Override
    public int runningSpeed() {
        return 55;
    }

    @Override
    public int swimmingSpeed() {
        return 20;
    }

    @Override
    public String fourage() {
        return "everything";
    }

    @Override
    public String toString() {
        return " Its a Crab " + super.toString()
                 + " eating "+ fourage() +
                " running " + runningSpeed() + " tgdk/s "
                + " swimming " + swimmingSpeed() + " psch/s "
                ;
    }
}
