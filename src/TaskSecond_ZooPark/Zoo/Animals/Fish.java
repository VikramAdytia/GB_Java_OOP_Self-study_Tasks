package TaskSecond_ZooPark.Zoo.Animals;

public class Fish extends Herbivores implements AbleToSwim{
    public Fish(String name) {
        super(name);
    }

    @Override
    public int swimmingSpeed() {
        return 20;
    }

    @Override
    public String fourage() {
        return "whatever";
    }

    @Override
    public String toString() {
        return " Its a Crab " + super.toString()
                + " eating "+ fourage()
                + " swimming " + swimmingSpeed() + " psch/s "
                ;
    }
}
