public class FeedingZooKeeper implements ZooKeeperVisitor{

    @Override
    public void visitElephant() {
        System.out.println("Feed the elephant");
    }

    @Override
    public void visitLion() {
        System.out.println("Feed the Lion");
    }

    @Override
    public void visitMonkey() {
        System.out.println("Feed the Monkey");
    }
}
