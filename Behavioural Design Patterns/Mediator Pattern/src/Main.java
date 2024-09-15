public class Main {
    public static void main(String[] args) throws Exception {
        Mediator mediator = new AuctionMediator();

        Buyer buyer1 = new AuctionBuyer(mediator, "Rohit", 100);
        Buyer buyer2 = new AuctionBuyer(mediator, "Rahul", 200);
        Buyer buyer3 = new AuctionBuyer(mediator, "Rajesh", 400);
        Buyer buyer4 = new AuctionBuyer(mediator, "Shobha", 500);

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);
        mediator.addBuyer(buyer4);

        mediator.findHighestBidder();
    }
}
