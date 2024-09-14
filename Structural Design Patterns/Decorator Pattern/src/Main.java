public class Main {
    public static void main(String[] args) throws Exception {
        IShape circle = new Circle();
        IShape square = new Square();

        ShapeDecorator shapeDecorator1 = new BlueShapeDecorator(circle);
        ShapeDecorator shapeDecorator2 = new RedShapeDecorator(square);

        shapeDecorator1.addColor();
        shapeDecorator2.addColor();
    }
}
