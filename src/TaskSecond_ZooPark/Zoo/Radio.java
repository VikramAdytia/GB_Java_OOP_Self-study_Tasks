package TaskSecond_ZooPark.Zoo;

import TaskSecond_ZooPark.Zoo.Animals.HasVocal;

public class Radio implements HasVocal {

    @Override
    public String sound() {
        return "Cheeki-Breeki! tutс tutс tyts tyts";
    }


    public String toString() {
        return " Its a Radio "
                + " playing " + sound()   ;
    }
}
