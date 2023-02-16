package TaskSecond_ZooPark.Zoo.Animals;

abstract class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String fourage() {
        return "grass";
    }

}
