public class Hatchback implements  ICar{
    int seats;
    String color;
    @Override
    public void getConfiguration() {
        System.out.println("This is an american car");
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
