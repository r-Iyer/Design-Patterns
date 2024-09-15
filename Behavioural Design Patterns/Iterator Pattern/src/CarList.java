import java.util.LinkedList;
import java.util.List;

public class CarList {
    List<Car> cars = new LinkedList<>();
    Iterator<Car> carIterator;
    
    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void removeCar(Car car) {
        this.cars.remove(car);
    }
    public Iterator<Car> getIterator() {
        carIterator = new IteratorImpl<>();
        carIterator.setIterable(cars);
        return carIterator;
    }
}
