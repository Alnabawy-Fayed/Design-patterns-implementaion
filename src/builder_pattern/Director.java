package builder_pattern;

public class Director{
    private Builder builder;
    public void construct(Builder builder){
        this.builder = builder;
        builder.startBuilding();
        builder.buildBody();
        builder.addWheels();
        builder.addPainting();
        builder.endBuilding();
    }

}
