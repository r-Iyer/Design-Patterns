public class Main {
    public static void main(String[] args) throws Exception {
        ISupport l3 = new L3Support();
        ISupport l2 = new L2Support();
        ISupport l1 = new L1Support();
        l2.setNextHandler(l3);
        l1.setNextHandler(l2);

        Request minorRequest = new Request(PriorityType.MINOR);
        Request mediumRequest = new Request(PriorityType.MINOR);
        Request majorRequest = new Request(PriorityType.MINOR);


        System.out.println("Minor issue");
        l1.assistance(minorRequest);
        System.out.println();

        System.out.println("Medium issue");
        l1.assistance(mediumRequest);
        System.out.println();

        System.out.println("Major issue");
        l1.assistance(majorRequest);
        System.out.println();
    }
}
