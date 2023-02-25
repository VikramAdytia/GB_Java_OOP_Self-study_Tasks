package TaskFourth_WaknessAndNormality_ShiledsOfSecurity.Weapons;

import TaskFourth_WaknessAndNormality_ShiledsOfSecurity.Weapon;

public class Melee implements Weapon {

    String weaponName;

    private int damagePoint;

    public Melee(String weaponName, int damagePoint) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
    }

    @Override
    public String toString() {
        return "Melee{" +
                "weaponName='" + weaponName + '\'' +
                ", damagePoint=" + damagePoint +
                '}';
    }

    @Override
    public int damage() {
        return damagePoint;
    }
}
