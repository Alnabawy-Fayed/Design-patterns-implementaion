package facade_pattern;

public class Client {
    public static void main(String[] args) {
        ShapeCreator shapeCreator = new ShapeCreator();
        shapeCreator.drawCircle();
        shapeCreator.drawSquare();
        shapeCreator.drawRecatangel();
    }
}
