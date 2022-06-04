package decorator_pattern;

public class BasePizza implements Pizza{
    String description;
    double cost;
    public BasePizza(){
        this.description = "pizza crust ";
        this.cost = 1;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }


}
