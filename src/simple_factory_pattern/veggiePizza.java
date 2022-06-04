package simple_factory_pattern;

public class veggiePizza extends Pizza{
    public veggiePizza(){
        name = " veggie pizza";
        size = "small";
        sauce = "tomatto sauce";
        extraStuff.add("Sliced mushrooms");
    }
}
