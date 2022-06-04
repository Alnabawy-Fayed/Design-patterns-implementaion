package decorator_pattern;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder().addSauce().addCheese().build();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }

}
