package pl.kocan.factory.units;

public class RedFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(20, 0, 10);
            default:
                throw new UnsupportedOperationException("Not known type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(75, 0, 35);
            default:
                throw new UnsupportedOperationException("Not known type");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case HELICOPTER:
                return new Helicopter(20, 0, 30);
            default:
                throw new UnsupportedOperationException("Not known type");
        }
    }
}
