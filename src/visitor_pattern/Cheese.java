package visitor_pattern;

public class Cheese implements Visitor {
    @Override
    public void visit(Pizza pizza) {
        pizza.setPrice(pizza.getPrice() + 2.8);
        pizza.setIngredients(pizza.getIngredients() + ", cheese");
    }
}
