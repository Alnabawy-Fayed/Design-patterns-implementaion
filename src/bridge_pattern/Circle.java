package bridge_pattern;

public class Circle extends Shape{
    public Circle(FillingColor color) {
        super(color);
    }

    @Override
    public String getDescription() {
        return "i am a circle filler with "+this.color.getColor();
    }
}
