public class ChangeChannelCommand implements Command{
    private TV tv;
    @Override
    public void executeCommand() {
        tv.changeChannel();
    }
    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

}
