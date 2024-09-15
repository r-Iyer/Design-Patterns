public class Stereo implements Device{
    public String Brand;
    public String Channel;
    public String Volume;
    @Override
    public String getBrandName() {
        return this.Brand;
    }
    @Override
    public void turnOn() {
        System.out.println("Turning on the Stereo");
    }
    @Override
    public void turnOff() {
        System.out.println("Turning off the Stereo");
    }
    public void changeFrequency() {
        System.out.println("Changing the frequency of the Stereo");
    }
}