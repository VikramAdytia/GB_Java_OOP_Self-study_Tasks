package TaskFourth_WaknessAndNormality_ShiledsOfSecurity;

import TaskFourth_WaknessAndNormality_ShiledsOfSecurity.Shields.Manlet;
import TaskFourth_WaknessAndNormality_ShiledsOfSecurity.Weapons.Ranged;

public class Archer extends BaseHero<Ranged, Manlet>{
    public Archer(int health, String name, Ranged ranged) {
        super(health, name, ranged);

    }

    public Archer(int health, String name, Ranged ranged, Manlet shield) {
        super(health, name, ranged, shield);
    }

    @Override
    public Ranged getWeapon() {
        return super.getWeapon();
    }

    public  int range(){
        return ((Ranged)weapon).getRange();

                //weapon.getRange();
    }

    @Override
    public String toString() {
        return /*"Archer{" +
                "weapon=" + weapon +
                "} " +*/ "Archer{" + super.toString() + "\n" +  "~~~";
    }
}
