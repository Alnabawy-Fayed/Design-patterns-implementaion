package factory_method_pattern;

public class CairoStore extends PizzaStore {
    @Override
    public Pizza creatPizza(String type){
        if(type == "CheesePizza"){
            return new CheezePizza();
        }
        else return new veggiePizza();
    }

}
