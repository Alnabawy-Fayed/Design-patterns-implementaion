package decorator_pattern;

import java.util.BitSet;

public class PizzaBuilder {
    Pizza pizza ;
    public PizzaBuilder(){
        this.pizza = new BasePizza();
    }
    public PizzaBuilder addSauce(){
        this.pizza = new SauceTopping(pizza);
        return this;
    }
    public PizzaBuilder addCheese(){
        this.pizza = new CheeseTopping(pizza);
        return this;
    }
    public Pizza build(){
        Pizza tempPizza = pizza;
        this.pizza= new BasePizza();
        return tempPizza;
    }
}
