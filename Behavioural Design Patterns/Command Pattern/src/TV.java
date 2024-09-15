public class TV implements Device{
    public String Brand;
    public String Channel;
    public String Volume;
    
    @Override
    public String getBrandName() {
        return null;
    }
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }
    public String getChannel() {
        return Channel;
    }
    public void setChannel(String channel) {
        Channel = channel;
    }
    public String getVolume() {
        return Volume;
    }
    public void setVolume(String volume) {
        Volume = volume;
    }
    @Override
    public void turnOn() {
        System.out.println("Turning on the TV");
    }
    @Override
    public void turnOff() {
        System.out.println("Turning off the TV");
    }

    public void changeChannel() {
        System.out.println("Changing the channel of TV");
    }

    public void adjustVolume() {
        System.out.println("Adjusting the  volume of TV");
    }
}
