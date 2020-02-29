import builder.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Chorizo", "Wloskie", "Salsa mexicana")
                .setSpicy(true)
                .build();
        System.out.println(pizza);
    }
}
