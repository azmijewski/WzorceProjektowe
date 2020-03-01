package abstractFactory;

import static abstractFactory.FactoryType.THREE_D_SHAPE_FACTORY;
import static abstractFactory.FactoryType.TWO_D_SHAPE_FACTORY;

/**
 * Client
 */
public class Application {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProvider.getFactory(TWO_D_SHAPE_FACTORY);

        if (factory == null){
            System.exit(1);
        }

        GeometricShape shape = factory.getShape(ShapeType.TRIANGLE);
        shape.draw();
        System.out.println(shape.area());

        factory = FactoryProvider.getFactory(THREE_D_SHAPE_FACTORY);

        if (factory == null){
            System.exit(1);
        }

        shape = factory.getShape(ShapeType.TRAPEZOID);
        shape.draw();
        System.out.println(shape.perimeter());

    }
}