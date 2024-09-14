public class BlueShapeDecorator extends ShapeDecorator{
    BlueShapeDecorator(IShape shape) {
        super(shape);
    }
    @Override
    public void addColor() {
        this.shape.describeShape();
        addDecoratedColor(shape);
    }
    @Override
    public void addDecoratedColor(IShape shape) {
        System.out.println("Adding Blue color"); 
     }
}
