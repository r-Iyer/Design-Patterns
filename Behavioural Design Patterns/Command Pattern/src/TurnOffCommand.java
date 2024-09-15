public class TurnOffCommand implements Command{
    Device device;
    @Override
    public void executeCommand() {
        device.turnOff();
    }
    public TurnOffCommand(Device device) {
        this.device = device;
    }

}
