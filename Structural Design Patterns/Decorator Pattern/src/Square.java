public class Square implements IShape{
    String color;
    @Override
    public void describeShape() {
        System.out.println("This is a Square");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Square [color=" + color + "]";
    }
}
