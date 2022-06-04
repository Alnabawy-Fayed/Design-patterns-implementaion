package decorator_pattern;

public abstract class Toppings implements Pizza {
    public Pizza pizza;
    public Toppings(Pizza pizza){
        this.pizza = pizza;
    }

}
