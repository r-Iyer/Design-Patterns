public class Elephant implements Animal{
    @Override
    public void accept(ZooKeeperVisitor zookeeperVisitor) {
        zookeeperVisitor.visitElephant(this);
    }
}
