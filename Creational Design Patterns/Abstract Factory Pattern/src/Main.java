public class Main {
    public static void main(String[] args) throws Exception {
        IFactory factory = new AmericanFactory();
        factory.createCar();
        factory = new EuropeanFactory();
        factory.createCar();
    }
}
