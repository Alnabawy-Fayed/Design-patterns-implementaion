package factory_method_pattern;

public class CheezePizza extends Pizza {
    public CheezePizza(){
        name = "Cheese pizza";
        size = "small";
        sauce = "tomatto sauce";
        extraStuff.add("Mozzarella");
    }
}
