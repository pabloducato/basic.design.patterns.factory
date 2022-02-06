package pl.kocan.factory.units;

import lombok.Getter;

@Getter
public abstract class InfantryUnit {

    private final int hp;
    private final int exp;
    private final int dmgDone;

    protected InfantryUnit(int hp, int exp, int dmgDone) {

        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }
}
