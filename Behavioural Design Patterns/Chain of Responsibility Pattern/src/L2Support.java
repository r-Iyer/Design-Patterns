public class L2Support extends ISupport{
    
    @Override
    public void assistance(Request request) {
        if(request.getPriorityType() == PriorityType.MEDIUM) {
            System.out.println("Resolved by L2 Support");
        }
        else {
            System.out.println("Cannot be resolved by L2 Support. Escalating to L3 Support");
            iSupport.assistance(request);
        }

    }

}
