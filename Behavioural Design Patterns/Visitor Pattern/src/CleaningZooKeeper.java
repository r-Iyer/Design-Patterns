public class CleaningZooKeeper implements ZooKeeperVisitor{
    @Override
    public void visitElephant(Elephant elephant) {

        System.out.println("Clean the elephant");
    }

    @Override
    public void visitLion(Lion lion) {
        System.out.println("Clean the Lion");
    }

    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Clean the Monkey");
    }
}
