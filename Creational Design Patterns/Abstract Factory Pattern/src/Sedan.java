public class Sedan implements  ICar{
    int seats;
    String color;
    @Override
    public void getConfiguration() {
        System.out.println("This is a Sedan");
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public int getSeats() {
        return seats;
    }
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }
}
