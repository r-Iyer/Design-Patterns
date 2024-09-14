public class CleaningZooKeeper implements ZooKeeperVisitor{
    @Override
    public void visitElephant() {
        System.out.println("Clean the elephant");
    }

    @Override
    public void visitLion() {
        System.out.println("Clean the Lion");
    }

    @Override
    public void visitMonkey() {
        System.out.println("Clean the Monkey");
    }
}
