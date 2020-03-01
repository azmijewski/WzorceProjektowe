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
<<<<<<< HEAD
    public int perimeter() {
=======
    public int circuit() {
>>>>>>> 28f9b4b826107a32e5438fe7d167f177ad41bae9
        return 50;
    }
}