package bridge_pattern;

public class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(new Red());
        Shape circle2 = new Circle(new Green());
        Shape rectangle = new Rectangle(new Blue());
        System.out.println(circle.getDescription());
        System.out.println(circle2.getDescription());
        System.out.println(rectangle.getDescription());
    }
}
