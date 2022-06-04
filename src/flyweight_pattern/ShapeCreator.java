package flyweight_pattern;

import java.util.ArrayList;
import java.util.List;

public class ShapeCreator {
    public List<Shape> shapeList = new ArrayList<>();

    public Shape getCircle(){
        for(Shape x: shapeList){
            if(x instanceof Circle){
                return x;
            }
        }
        Circle circle  = new Circle();
        shapeList.add(circle);
        return circle;
    }
}
