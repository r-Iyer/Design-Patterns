public class Main {
    public static void main(String[] args) throws Exception {
        IWorkshop assemble = new Assemble();
        IWorkshop produce = new Produce();
        Vehicle car = new Car(assemble, produce);
        Vehicle bus = new Bus(assemble, produce);
        car.manufacture();
        bus.manufacture();
    }
}
