package abstractFactory.exc;

public class Application {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProvider.getFactory(VehicleType.CAR);
         Vehicle vehicle = factory.getVehicle();
         vehicle.drive();
    }
}
