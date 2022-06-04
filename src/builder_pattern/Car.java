package builder_pattern;

public class Car implements Builder{
    private String carName ;
    private Vehicle vehicle;
    public Car(String name){
        this.carName = name;
        vehicle = new Vehicle();
    }
    @Override
    public void startBuilding() {
        vehicle.add("building "+carName+" car :\n");
    }

    @Override
    public void buildBody() {
        vehicle.add("building the body\n");
    }

    @Override
    public void addWheels() {
        vehicle.add("adding wheels\n");
    }

    @Override
    public void addPainting() {
        vehicle.add("adding paint\n");
    }

    @Override
    public void endBuilding() {
        vehicle.add(carName+ " car is ready !!!\n");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
