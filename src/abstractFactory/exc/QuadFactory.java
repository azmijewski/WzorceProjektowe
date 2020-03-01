package abstractFactory.exc;

public class QuadFactory extends AbstractFactory {
    @Override
    public Vehicle getVehicle() {
        return new Quad();
    }
}
