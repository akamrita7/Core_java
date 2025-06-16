package designPattern.creational.prototype;

public class Shape implements Prototype{
    private String type;
    private String color;

    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Shape [Type = " + type + ", Color = " + color + "]";
    }

    @Override
    public Prototype clone() {
        return new Shape(this.type,this.color);
    }
}
