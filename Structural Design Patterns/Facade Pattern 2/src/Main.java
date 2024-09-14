public class Main {
    public static void main(String[] args) throws Exception {
        
        Restaurant a2b =  new VegRestaurant("A2B");
        a2b.addMenuList("Idli");
        a2b.addMenuList("Dosa");

        Restaurant haldirams =  new VegRestaurant("Haldirams");
        haldirams.addMenuList("Chole Bhature");
        haldirams.addMenuList("Chinese Combo Meal");

        Restaurant arsalan = new NonVegRestaurant("Arsalan");
        arsalan.addMenuList("Chicken Biryani");
        arsalan.addMenuList("Mutton Biryani");

        Restaurant mariott = new BothRestaurant("Mariott");
        mariott.addMenuList("Chicken Noodles");
        mariott.addMenuList("Veg Fried Rice");
        
        Keeper waiter = new Keeper();
        waiter.addRestaurant(a2b);
        waiter.addRestaurant(haldirams);
        waiter.addRestaurant(arsalan);
        waiter.addRestaurant(mariott);

        client(waiter);
    }
    
    static void client(Keeper waiter) {
        System.out.println("Veg Restaurants:");
        waiter.getMenu(VegRestaurant.class);

        System.out.println();
        System.out.println("Non Veg Restaurants:");
        waiter.getMenu(NonVegRestaurant.class);

        System.out.println();
        System.out.println("Both Restaurants:");
        waiter.getMenu(BothRestaurant.class);
    }
}
