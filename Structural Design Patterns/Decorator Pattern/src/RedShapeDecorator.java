public class RedShapeDecorator extends ShapeDecorator{
    RedShapeDecorator(IShape shape) {
        super(shape);
    }
    @Override
    public void addColor() {
        this.shape.describeShape();
        addDecoratedColor(shape);
    }
    @Override
    public void addDecoratedColor(IShape shape) {
        System.out.println("Adding Red color"); 
     }
}
