package pl.kocan.factory;

import pl.kocan.factory.units.Factory;
import pl.kocan.factory.units.Unit;
import pl.kocan.factory.units.UnitFactory;
import pl.kocan.factory.units.UnitType;

public class Main {

    public static void main(String[] args) {
//        final Unit tank = new Tank(200, 0, 20);
//        final Unit infantryman = new Rifleman(100, 0, 10);

//        System.out.println(tank);
//        System.out.println(infantryman);

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);

        System.out.println(tank);
        System.out.println(infantryman);

//        Unit tank2 = new Tank(1, 1, 2);

    }

}
