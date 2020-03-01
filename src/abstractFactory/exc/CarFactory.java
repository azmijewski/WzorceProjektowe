package abstractFactory.exc;

public class CarFactory extends AbstractFactory {
    @Override
    public Vehicle getVehicle() {
        return new Car();
    }
}
