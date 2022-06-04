package abstract_factory;

public class CheezePizza extends Pizza {
    IngrediantsFactory ingrediantsFactory;
    public CheezePizza( IngrediantsFactory ingrediantsFactory){
        this.ingrediantsFactory = ingrediantsFactory;
        name = " Cheese pizza";
        size = "small";
        sauce = ingrediantsFactory.creatSauce().toString();
        extraStuff.add("Sliced mushrooms");
    }
}
