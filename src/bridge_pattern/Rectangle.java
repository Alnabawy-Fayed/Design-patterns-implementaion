package bridge_pattern;

public class Rectangle extends Shape{
    public Rectangle(FillingColor color) {
        super(color);
    }

    @Override
    public String getDescription() {
        return "i am a rectangle filled with "+this.color.getColor();
    }
}
