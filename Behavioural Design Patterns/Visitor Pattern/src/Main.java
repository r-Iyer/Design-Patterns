public class Main {
    public static void main(String[] args) throws Exception {
        Animal monkey = new Monkey();
        Animal elephant = new Elephant();
        Animal lion = new Lion();
        ZooKeeperVisitor feedZooKeeperVisitor = new FeedingZooKeeper();
        ZooKeeperVisitor cleanZooKeeperVisitor = new CleaningZooKeeper();
        monkey.accept(feedZooKeeperVisitor);
        lion.accept(cleanZooKeeperVisitor);
        elephant.accept(cleanZooKeeperVisitor);
    }
}
