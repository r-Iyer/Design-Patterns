public class Lion implements Animal{
    @Override
    public void accept(ZooKeeperVisitor zookeeperVisitor) {
        zookeeperVisitor.visitLion();
    }
}
