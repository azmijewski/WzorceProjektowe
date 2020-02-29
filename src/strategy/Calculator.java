package strategy;

public class Calculator {
    private CalculationStartegy calculationStartegy;

    public Calculator() {
    }

    public void setCalculationStartegy(CalculationStartegy calculationStartegy) {
        this.calculationStartegy = calculationStartegy;
    }

    public int calculate(int a, int b){
        return calculationStartegy.calculate(a, b);
     }
}
