package simple_factory_pattern;

public class Client {
    public static void main(String[] args) {
        Factory factory = new SimpleFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
         Pizza pizza = pizzaStore.orderPizza("CheesePizza");
        System.out.println("you pizza details : \n"+pizza.toString());

    }
}
