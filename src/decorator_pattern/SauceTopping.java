package decorator_pattern;

public class SauceTopping extends Toppings{
    public SauceTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" , sauce";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+2;
    }
}
