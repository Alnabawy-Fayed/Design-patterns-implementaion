package decorator_pattern;

public class CheeseTopping extends Toppings{
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+3;
    }
}
