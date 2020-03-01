package abstractFactory;

/**
 * Concrete product
 */
public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }

    @Override
    public int area() {
        return 1;
    }

    @Override
    public int circuit() {
        return 2;
    }
}