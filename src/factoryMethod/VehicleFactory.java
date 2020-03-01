package factoryMethod;

public class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType){
        if (VehicleType.CAR == vehicleType){
            return new Car();
        } else if (VehicleType.QUAD == vehicleType){
            return new Quad();
        } else if (VehicleType.MOTORBIKE == vehicleType){
            return new Motorbike();
        }
        return null;
    }
}
