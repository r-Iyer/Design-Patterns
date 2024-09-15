public class Main {
    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine = new VendingMachine(5);

        vendingMachine.getCurrentState();
        vendingMachine.request();

    }
}
