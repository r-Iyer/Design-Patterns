public class Circle implements IShape{
    String color;
    @Override
    public void describeShape() {
        System.out.println("This is a Circle");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Circle [color=" + color + "]";
    }
}
