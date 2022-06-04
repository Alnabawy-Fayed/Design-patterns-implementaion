package template_pattern;

public abstract class HotDrink {
    final void prepare(){
         boilWater();
         addMainComponrent();
         addWaterToCub();
         addExtraStuff();

    }
    protected void boilWater(){
        System.out.println("boiling the water");
    }
    private void addWaterToCub(){
        System.out.println("adding hot water to the cup");
    }
    protected abstract void addMainComponrent();
    protected abstract void addExtraStuff();


}
