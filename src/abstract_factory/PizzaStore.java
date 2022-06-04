package abstract_factory;

public  abstract class PizzaStore {
    public Pizza orderPizza(String... type){
        String kind = null;
        if(type.length > 0)
            kind = type[0];
        Pizza pizza = creatPizza(kind);
        pizza.preparePizza();
        pizza.bakePizza();
        pizza.cutPizza();
        pizza.boxPizza();
         return pizza;
    }
    public abstract Pizza creatPizza(String type);
}
