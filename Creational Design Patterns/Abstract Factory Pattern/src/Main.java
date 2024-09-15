public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Calling American Factory");
        IFactory factory = new AmericanFactory();
        factory.createCar();

        System.out.println("Calling European Factory");
        factory = new EuropeanFactory();
        factory.createCar();
    }
}
