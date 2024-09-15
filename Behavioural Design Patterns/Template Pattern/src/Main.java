public class Main {
    public static void main(String[] args) throws Exception {
        BeverageMaker teaMaker = new TeaMaker();
        BeverageMaker coffeeMaker = new CoffeeMaker();
        System.out.println("Tea..");
        teaMaker.prepareBeverage();
        System.out.println("\nCoffee..");
        coffeeMaker.prepareBeverage();
    }
}
