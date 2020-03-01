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
<<<<<<< HEAD
    public int perimeter() {
=======
    public int circuit() {
>>>>>>> 28f9b4b826107a32e5438fe7d167f177ad41bae9
        return 10;
    }
}
