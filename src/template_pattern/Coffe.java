package template_pattern;

public class Coffe extends HotDrink{
    @Override
    protected void addMainComponrent() {
        System.out.println("adding coffe to the hot water");
    }

    @Override
    protected void addExtraStuff() {
        System.out.println("adding sugar");
    }
}
