package TaskSecond_ZooPark.Zoo.Animals;

import java.util.UUID;

public abstract class Animal {

    private String name;
    
    public abstract String fourage();

    private UUID id;

    public Animal(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "It respond on " + name  +
               ", it's passport is " + id ;
    }
}
