package abstract_factory;

public class veggiePizza extends Pizza {
    IngrediantsFactory ingrediantsFactory;
    public veggiePizza( IngrediantsFactory ingrediantsFactory){
        this.ingrediantsFactory = ingrediantsFactory;
        name = " veggie pizza";
        size = "small";
        sauce = ingrediantsFactory.creatSauce().toString();
        extraStuff.add("Sliced mushrooms");
    }
}
