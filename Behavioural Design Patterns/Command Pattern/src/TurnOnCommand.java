public class TurnOnCommand implements Command{
    Device device;
    @Override
    public void executeCommand() {
        device.turnOn();
    }
    public TurnOnCommand(Device device) {
        this.device = device;
    }

}
