package com.CreationalDesignPattern.BuilderEx1;

public class Pizza {
	 // Required parameters
    private final String dough;
    private final String sauce;

    // Optional parameters
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;

    // Private constructor to prevent direct instantiation
    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.bacon = builder.bacon;
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough and " + sauce + " sauce. " +
               (cheese ? "Cheese " : "") +
               (pepperoni ? ", Pepperoni " : "") +
               (bacon ? ", Bacon" : "");
    }

    // The Builder class
    public static class PizzaBuilder {
        private final String dough;
        private final String sauce;

        private boolean cheese;
        private boolean pepperoni;
        private boolean bacon;

        public PizzaBuilder(String dough, String sauce) {
            this.dough = dough;
            this.sauce = sauce;
        }

        public PizzaBuilder addCheese() {
            this.cheese = true;
            return this;
        }

        public PizzaBuilder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public PizzaBuilder addBacon() {
            this.bacon = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
