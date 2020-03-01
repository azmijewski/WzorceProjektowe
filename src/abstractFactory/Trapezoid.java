package abstractFactory;

public class Trapezoid implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Trapezoid is drawn");
    }

    @Override
    public int area() {
        return 20;
    }

    @Override
    public int circuit() {
        return 10;
    }
}
