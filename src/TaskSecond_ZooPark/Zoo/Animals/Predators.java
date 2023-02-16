package TaskSecond_ZooPark.Zoo.Animals;

abstract class Predators extends Animal {

    public Predators(String name) {
        super(name);

    }



    @Override
    public String fourage() {
        return "meat";
    }

}
