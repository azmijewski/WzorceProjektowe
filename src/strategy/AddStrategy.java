package strategy;

public class AddStrategy implements CalculationStartegy {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
