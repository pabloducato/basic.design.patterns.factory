package pl.kocan.factory.units;

import lombok.Getter;

@Getter
abstract public class MechanizedUnit {

    private final int hp;
    private final int exp;
    private final int dmgDone;

    protected MechanizedUnit(int hp, int exp, int dmgDone) {

        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }
}
