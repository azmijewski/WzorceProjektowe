package abstractFactory.exc;

public class FactoryProvider {
    public static AbstractFactory getFactory(VehicleType vehicleType){
        if (VehicleType.CAR == vehicleType){
            return new CarFactory();
        } else if (VehicleType.MOTORBIKE == vehicleType){
            return new MotorbikeFactory();
        } else if (VehicleType.QUAD == vehicleType){
            return new QuadFactory();
        }
        return null;
    }
}
