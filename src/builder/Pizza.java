package builder;

public class Pizza {
    private String ingredient;
    private String cake;
    private String sos;
    private boolean isWhite;
    private boolean isSpicy;

    private Pizza(Builder builder) {
        this.ingredient = builder.ingredient;
        this.cake = builder.cake;
        this.sos = builder.sos;
        this.isSpicy = builder.isSpicy;
        this.isWhite = builder.isWhite;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingredient='" + ingredient + '\'' +
                ", cake='" + cake + '\'' +
                ", sos='" + sos + '\'' +
                ", isWhite=" + isWhite +
                ", isSpicy=" + isSpicy +
                '}';
    }

    public static class Builder{
        private String ingredient;
        private String cake;
        private String sos;
        private boolean isWhite;
        private boolean isSpicy;

        public Builder(String ingredient, String cake, String sos) {
            this.ingredient = ingredient;
            this.cake = cake;
            this.sos = sos;
        }

        public Builder setWhite(boolean white) {
            isWhite = white;
            return this;
        }

        public Builder setSpicy(boolean spicy) {
            isSpicy = spicy;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
}
