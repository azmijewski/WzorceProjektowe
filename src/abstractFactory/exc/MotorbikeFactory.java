package abstractFactory.exc;

public class MotorbikeFactory extends AbstractFactory {
    @Override
    public Vehicle getVehicle() {
        return new Motorbike();
    }
}
