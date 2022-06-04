package simple_factory_pattern;

public class SimpleFactory implements Factory {
    @Override
    public Pizza creatPizza(String type) {
        if(type == "CheesePizza"){
            return new CheezePizza();
        }
        else return new veggiePizza();
    }
}
