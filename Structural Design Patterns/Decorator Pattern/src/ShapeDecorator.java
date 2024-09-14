public abstract class ShapeDecorator implements IShape{
    IShape shape;
    ShapeDecorator(IShape shape) {
        this.shape = shape;
    }
    public abstract void addColor();
    public abstract void addDecoratedColor(IShape shape);
    @Override
    public void describeShape() {
        shape.describeShape();
    }
}
