public class Bus extends Vehicle{
    public Bus(IWorkshop workshop1, IWorkshop workshop2) {
        super(workshop1, workshop2);
    }
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Bus...");
        workshop1.work();
        workshop2.work();
    }
}
