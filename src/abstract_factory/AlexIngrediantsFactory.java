package abstract_factory;

public class AlexIngrediantsFactory implements IngrediantsFactory{
    @Override
    public Sauce creatSauce() {
        return  new AlexSauce();
    }
}
