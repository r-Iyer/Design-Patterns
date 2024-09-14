import java.util.LinkedList;
import java.util.List;

abstract class Restaurant {
    String name;
    List<String> dishes = new LinkedList<>();
    Restaurant(String name) {
        this.name = name;
    }
    public void displayMenu() {
        for(String dish : dishes) {
            System.out.println("Dish: "+dish);
        }
    }
    public void addMenuList(String dish) {
        dishes.add(dish);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
