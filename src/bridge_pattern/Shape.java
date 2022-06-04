package bridge_pattern;

public  abstract class Shape {
    FillingColor color;
    public Shape(FillingColor color){
        this.color = color;
    }
    public abstract String getDescription();
}
