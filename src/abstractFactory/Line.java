package abstractFactory;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }

    @Override
    public int area() {
        return 0;
    }

    @Override
    public int perimeter() {
        return 23;
    }

}