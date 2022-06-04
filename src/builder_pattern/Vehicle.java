package builder_pattern;

import java.util.LinkedList;

public class Vehicle {
    private LinkedList<String> parts ;
    public Vehicle(){
        parts = new LinkedList<>();
    }
    public void add(String part){
        parts.addLast(part);
    }
    public String showVehicle(){
        StringBuilder result = new StringBuilder();
        for(String part : parts){
            result.append(part);
        }
        return result.toString();
    }
}
