package simple_factory_pattern;

public class CheezePizza extends Pizza{
    public CheezePizza(){
        name = "Cheese pizza";
        size = "small";
        sauce = "tomatto sauce";
        extraStuff.add("Mozzarella");
    }
}
