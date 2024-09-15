public class AdjustFrequencyCommand implements Command{
    private Stereo stereo;
    @Override
    public void executeCommand() {
        stereo.changeFrequency();
    }
    public AdjustFrequencyCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public Stereo getStereo() {
        return stereo;
    }

    public void setStereo(Stereo stereo) {
        this.stereo = stereo;
    }

}
