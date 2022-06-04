package factory_method_pattern;

import java.util.Random;

public class AlexStore extends PizzaStore{

    //returning random pizza
    @Override
    public Pizza creatPizza(String type) {
        Random random = new Random();
        int r = random.nextInt(2);
        if(r==0)
            return new CheezePizza();
        else return new veggiePizza();
    }
}
