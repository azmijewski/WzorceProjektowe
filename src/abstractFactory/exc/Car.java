package abstractFactory.exc;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Samochod jedzie");
    }
}
