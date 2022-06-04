package flyweight_pattern;

public class client {
    public static void main(String[] args) {
        ShapeCreator shapeCreator = new ShapeCreator();
        Circle c = (Circle) shapeCreator.getCircle();
        Circle c2 = (Circle) shapeCreator.getCircle();
        System.out.println(c==c2);

    }
}
