package abstractFactory;

public class Triangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Triangle is drawn");
    }

    @Override
    public int area() {
        return 12;
    }

    @Override
    public int perimeter() {
        return 13;
    }
}
