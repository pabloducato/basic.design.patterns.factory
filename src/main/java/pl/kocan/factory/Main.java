package pl.kocan.factory;

import pl.kocan.factory.units.InfantryFactory;
import pl.kocan.factory.units.InfantryUnit;
import pl.kocan.factory.units.RedInfantryUnitFactory;
import pl.kocan.factory.units.UnitType;

public class Main {

    public static void main(String[] args) {
//        final Unit tank = new Tank(200, 0, 20);
//        final Unit infantryman = new Rifleman(100, 0, 10);

//        System.out.println(tank);
//        System.out.println(infantryman);

        InfantryFactory factory = new RedInfantryUnitFactory();

        InfantryUnit tank = factory.createUnit(UnitType.TANK);
        InfantryUnit infantryman = factory.createUnit(UnitType.RIFLEMAN);

        System.out.println(tank);
        System.out.println(infantryman);

//        Unit tank2 = new Tank(1, 1, 2);

    }

}
