public class Remote {
    Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.executeCommand();
    }
    
}
