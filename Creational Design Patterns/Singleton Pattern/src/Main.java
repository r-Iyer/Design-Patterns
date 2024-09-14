public class Main {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();
        instance1.setData(1);
        System.out.println(instance1.toString());
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2.toString());
        System.out.println("Hashcode of instance1 = " + instance2.toString() + "\n" +
            "Hashcode of instance2 = " + instance2.toString());
    }
}
