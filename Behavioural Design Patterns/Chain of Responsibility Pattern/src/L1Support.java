public class L1Support extends ISupport{

    @Override
    public void assistance(Request request) {
        if(request.getPriorityType() == PriorityType.MINOR) {
            System.out.println("Resolved by L1 Support");
        }
        else {
            System.out.println("Cannot be resolved by L1 Support. Escalating to L2 Support");
            iSupport.assistance(request);
        }

    }

}