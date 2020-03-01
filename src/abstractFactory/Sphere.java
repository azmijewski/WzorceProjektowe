package abstractFactory;

/**
 * Concrete product
 */
public class Sphere implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Sphere drawn.");
    }

    @Override
    public int area() {
        return 10;
    }

    @Override
    public int circuit() {
        return 50;
    }
}