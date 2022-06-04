package abstract_factory;

import java.util.Random;

public class AlexStore extends PizzaStore {

    //returning random pizza
    @Override
    public Pizza creatPizza(String type) {
        Random random = new Random();
        int r = random.nextInt(2);
        if(r==0)
            return new CheezePizza(new AlexIngrediantsFactory());
        else return new veggiePizza(new AlexIngrediantsFactory());
    }
}
