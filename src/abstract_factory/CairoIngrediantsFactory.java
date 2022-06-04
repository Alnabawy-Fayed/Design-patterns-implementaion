package abstract_factory;

public class CairoIngrediantsFactory implements IngrediantsFactory{
    @Override
    public Sauce creatSauce() {
        return new CiroSauce();
    }
}
