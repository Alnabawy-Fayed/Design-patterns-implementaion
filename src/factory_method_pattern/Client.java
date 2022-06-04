package factory_method_pattern;

public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new AlexStore();
         Pizza pizza = pizzaStore.orderPizza();
        System.out.println("you pizza details : \n"+pizza.toString());

    }
}
