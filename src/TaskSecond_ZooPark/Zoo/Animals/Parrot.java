package TaskSecond_ZooPark.Zoo.Animals;

public class Parrot extends Herbivores implements AbleToFly,HasVocal {
    public Parrot(String name) {
        super(name);
    }


    @Override
    public int flyingSpeed() {
        return 25;
    }


    @Override
    public String sound() {
        return "how to get sound from another class";
    }

    @Override
    public String toString() {
        return " Its a Parrot " + super.toString()
                + " saying " + sound() + " eating " + fourage()
                + " flying " + flyingSpeed() + " byak/s "
                ;
    }
}
