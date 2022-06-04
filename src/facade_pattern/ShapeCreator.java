package facade_pattern;

public class ShapeCreator {
    Circle circle;
    Rectangel rectangel;
    Square square;
    public ShapeCreator(){
        circle = new Circle();
        rectangel = new Rectangel();
        square = new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRecatangel(){
        rectangel.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
