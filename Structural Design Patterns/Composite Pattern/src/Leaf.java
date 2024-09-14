public class Leaf implements Component{
    String type;
    Leaf(String type) {
        this.type = type;
    }
    @Override
    public void describeParts(String indent) {
        System.out.println(indent + "Describing Leaf: " + this.type);
    }
}
