import adapter.fileConvertion.*;
import strategy.AddStrategy;
import strategy.Calculator;
import strategy.SubtractStrategy;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setCalculationStartegy(new AddStrategy());
        System.out.println(calculator.calculate(5, 10));
        calculator.setCalculationStartegy(new SubtractStrategy());
        System.out.println(calculator.calculate(5, 10));
    }
}
