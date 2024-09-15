public class Monkey implements Animal{
    @Override
    public void accept(ZooKeeperVisitor zookeeperVisitor) {
        zookeeperVisitor.visitMonkey(this);
    }
}
