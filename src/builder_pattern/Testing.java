package builder_pattern;

public class Testing {
    public static void main(String[] args) {
        Builder carBulilder = new Car("BMW");
        Builder carBuilder2 = new Car("lada");
        Director director = new Director();
        director.construct(carBulilder);
        director.construct(carBuilder2);
        Vehicle vehicle = carBulilder.getVehicle();
        Vehicle vehicle2 = carBuilder2.getVehicle();
        System.out.println(vehicle.showVehicle());
        System.out.println(vehicle2.showVehicle());
    }
}
