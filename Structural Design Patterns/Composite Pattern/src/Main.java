public class Main {
    public static void main(String[] args) throws Exception {

        Component hardDisk = new Leaf("Hard Disk");
        Component ram = new Leaf("RAM");
        Component cpu = new Leaf("CPU");
        Component mouse = new Leaf("Mouse");
        Component keyboard = new Leaf("Keyboard");
        
        Composite motherBoard = new Composite("Mother Board");
        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);

        Composite cabinet = new Composite("Cabinet");
        cabinet.addComponent(hardDisk);
        cabinet.addComponent(motherBoard);        

        Composite peripherals = new Composite("Peripherals");
        peripherals.addComponent(mouse);
        peripherals.addComponent(keyboard);

        Composite computer = new Composite("Computer");
        computer.addComponent(cabinet);
        computer.addComponent(peripherals);

        computer.describeParts("");
    }
}
