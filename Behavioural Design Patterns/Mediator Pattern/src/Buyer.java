public abstract class Buyer {
    Mediator mediator;
    String name;
    int price;
    public Buyer(Mediator mediator, String name, int price) {
        this.mediator = mediator;
        this.name = name;
        this.price = price;
    }
    public Mediator getMediator() {
        return mediator;
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
