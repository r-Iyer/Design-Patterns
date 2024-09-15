public class Main {
    public static void main(String[] args) throws Exception {
        TV tv = new TV();
        Stereo stereo = new Stereo();
        
        Command turnOffCommandTV = new TurnOffCommand(tv);
        Command turnOnCommandTV = new TurnOnCommand(tv);
        
        Command turnOffCommandRadio = new TurnOffCommand(stereo);
        Command turnOnCommandRadio = new TurnOnCommand(stereo);

        Command adjustFrequencyCommand = new AdjustFrequencyCommand(stereo);
        Command changeVolumeCommand = new ChangeChannelCommand(tv);

        Remote remote = new Remote();

        remote.setCommand(turnOnCommandTV);
        remote.pressButton();

        remote.setCommand(turnOnCommandRadio);
        remote.pressButton();

        remote.setCommand(adjustFrequencyCommand);
        remote.pressButton();

        remote.setCommand(changeVolumeCommand);
        remote.pressButton();

        remote.setCommand(turnOffCommandTV);
        remote.pressButton();

        remote.setCommand(turnOffCommandRadio);
        remote.pressButton();

    }
}
