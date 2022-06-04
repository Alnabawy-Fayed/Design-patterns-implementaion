package bridge_pattern;

public class Square extends Shape{
    public Square(FillingColor color) {
        super(color);
    }

    @Override
    public String getDescription() {
        return "i am a circle filled with "+this.color.getColor();
    }
}
