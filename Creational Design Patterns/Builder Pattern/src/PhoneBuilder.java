public class PhoneBuilder {
    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int camera;
    public String getOs() {
        return os;
    }
    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }
    Phone build() {
        return new Phone(os,processor,screenSize,battery,camera);
    }
}
