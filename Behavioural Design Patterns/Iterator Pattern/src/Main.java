public class Main {
    public static void main(String[] args) throws Exception {
        Car marutiCar = new Car("Maruti Suzuki", "Hatchback");
        Car kiaCar = new Car("Kia", "SUV");
        Car innovaCar = new Car("Innova", "MPV");

        CarList cars = new CarList();
        cars.addCar(marutiCar);
        cars.addCar(kiaCar);
        cars.addCar(innovaCar);

        Iterator<Car> iterator = cars.getIterator();

        do {
            System.out.println(iterator.get());
        } while(iterator.next());
    }
}
