package factoryMethod;

public class Application {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.CAR);
        if (vehicle == null){
            System.exit(1);
        }
        vehicle.drive();
        vehicle = VehicleFactory.getVehicle(VehicleType.MOTORBIKE);
        if (vehicle == null){
            System.exit(1);
        }
        vehicle.drive();
    }

}
