package strategy;

public class SubtractStrategy implements CalculationStartegy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
