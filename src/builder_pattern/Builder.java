package builder_pattern;

public interface Builder {
    void startBuilding();
    void buildBody();
    void addWheels();
    void addPainting();
    void endBuilding();
    Vehicle getVehicle();
}
