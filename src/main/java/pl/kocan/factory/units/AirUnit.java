package pl.kocan.factory.units;

import lombok.Getter;

@Getter
abstract public class AirUnit {

    private final int hp;
    private final int exp;
    private final int dmgDone;

    protected AirUnit(int hp, int exp, int dmgDone) {

        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }
}
