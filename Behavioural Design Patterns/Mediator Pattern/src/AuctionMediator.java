
import java.util.LinkedList;
import java.util.List;

public class AuctionMediator implements Mediator{

    List<Buyer> buyers= new LinkedList<>();

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        
    }

    @Override
    public void findHighestBidder() {
        Buyer highestBuyer = null;
        int maxPrice = 0;
        for(Buyer buyer : this.buyers) {
            if(buyer.getPrice() > maxPrice) {
                maxPrice = buyer.getPrice();
                highestBuyer = buyer;
            }
        }
        if(highestBuyer != null) {
            System.out.println("Auction buyer : "+highestBuyer.getName() + 
                " offered the highest price for the product. Price = " + 
                highestBuyer.getPrice()); 
        }
    }

}
