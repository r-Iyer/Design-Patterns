public class Car {
    String brand;
    String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", type=" + type + "]";
    }
}
