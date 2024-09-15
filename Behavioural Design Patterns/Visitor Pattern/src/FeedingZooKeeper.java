public class FeedingZooKeeper implements ZooKeeperVisitor{

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Feed the elephant");
    }

    @Override
    public void visitLion(Lion lion) {
        System.out.println("Feed the Lion");
    }

    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Feed the Monkey");
    }
}
