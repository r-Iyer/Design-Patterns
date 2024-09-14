abstract class Vehicle {
    protected IWorkshop workshop1;
    protected IWorkshop workshop2;

    public Vehicle(IWorkshop wokshop1, IWorkshop workshop2) {
        this.workshop1 = wokshop1;
        this.workshop2 = workshop2;
    }
    abstract void manufacture();
}
