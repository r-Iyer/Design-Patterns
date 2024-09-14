import java.util.LinkedList;
import java.util.List;

class Composite implements Component{
    String type;
    List<Component> components = new LinkedList<>();

    Composite(String type) {
        this.type = type;
    }

    void addComponent(Component component) {
        components.add(component);
    }
    @Override
    public void describeParts(String indent) {
        System.out.println(indent + "Describing Composite: "+this.type);
        for(Component component : components) {
            component.describeParts(indent + "\t");
        }
        System.out.println(indent + "Description end for Composite: "+this.type);
    }
}
