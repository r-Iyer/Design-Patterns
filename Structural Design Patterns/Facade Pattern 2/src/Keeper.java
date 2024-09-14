import java.util.LinkedList;
import java.util.List;

public class Keeper {
    List<Restaurant> restaurants = new LinkedList<>();
    void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    void getMenu(Class<? extends Restaurant> restaurantType) {
        for(Restaurant restaurant : restaurants) {
            if(restaurantType.isInstance(restaurant)) {
                System.out.println("Printing menu of "+restaurant.getName());
                restaurant.displayMenu();
            }

        }
    }

}
