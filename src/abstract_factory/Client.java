package abstract_factory;

public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new AlexStore();
        for(int i = 0; i < 10; i++) {
            Pizza pizza = pizzaStore.orderPizza();
            System.out.println("you pizza details : \n" + pizza.toString());
        }

    }
}
