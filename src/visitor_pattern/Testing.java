package visitor_pattern;

public class Testing {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Visitor A = new Sauce();
        Visitor B = new Cheese();
        System.out.println(pizza.getIngredients());
        System.out.println(pizza.getPrice());
       pizza.accept(B);
        System.out.println(pizza.getIngredients());
        System.out.println(pizza.getPrice());
        B.visit(pizza);
        System.out.println(pizza.getIngredients());
        System.out.println(pizza.getPrice());
    }
}
