package pl.kocan.factory;

import pl.kocan.factory.units.*;

public class Main {

    public static void main(String[] args) {
//        final Unit tank = new Tank(200, 0, 20);
//        final Unit infantryman = new Rifleman(100, 0, 10);

//        System.out.println(tank);
//        System.out.println(infantryman);

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.TANK);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantry = blueFactory.createInfantryUnit(UnitType.TANK);
        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);

    }

}
