package TaskFourth_WaknessAndNormality_ShiledsOfSecurity;

import TaskFourth_WaknessAndNormality_ShiledsOfSecurity.Shields.HandShield;
import TaskFourth_WaknessAndNormality_ShiledsOfSecurity.Weapons.Melee;

public class Footman extends BaseHero<Melee, HandShield> {

    public Footman(int health, String name, Melee weapon) {
        super(health, name, weapon);
    }

    public Footman(int health, String name, Melee weapon, HandShield shield) {
        super(health, name, weapon, shield);
    }

    @Override
    public String toString() {
        return "Footman{" +
                "} " + super.toString() + "\n" +  "~~~";
    }
}
