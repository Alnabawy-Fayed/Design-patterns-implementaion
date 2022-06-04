package visitor_pattern;

public class Sauce implements Visitor{
    @Override
    public void visit(Pizza pizza) {
        pizza.setPrice(pizza.getPrice()+2.2);
        pizza.setIngredients(pizza.getIngredients()+", sauce");
    }
}
