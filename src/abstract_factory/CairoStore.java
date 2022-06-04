package abstract_factory;

public class CairoStore extends PizzaStore {
    @Override
    public Pizza creatPizza(String type){
        if(type == "  "){
            return new CheezePizza(new CairoIngrediantsFactory());
        }
        else return new veggiePizza(new CairoIngrediantsFactory());
    }

}
