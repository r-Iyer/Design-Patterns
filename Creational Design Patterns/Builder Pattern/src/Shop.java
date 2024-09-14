public class Shop {
    public static void main(String[] args) throws Exception {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Phone phone = phoneBuilder.setOs("ios").setBattery(500).build();
        System.out.println(phone.toString());
    }
}
