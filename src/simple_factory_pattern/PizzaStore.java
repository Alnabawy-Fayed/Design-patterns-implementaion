package simple_factory_pattern;

public class PizzaStore {
    Factory factory;
    public PizzaStore(Factory factory){
        this.factory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza = factory.creatPizza(type);
        pizza.preparePizza();
        pizza.bakePizza();
        pizza.cutPizza();
        pizza.boxPizza();
         return pizza;
    }
}
