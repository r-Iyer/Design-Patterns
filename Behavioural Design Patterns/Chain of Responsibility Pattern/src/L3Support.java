public class L3Support extends ISupport{
    
    @Override
    public void assistance(Request request) {
        if(request.getPriorityType() == PriorityType.MAJOR) {
            System.out.println("Resolved by L3 Support");
        }
        else
            System.out.println("Issue cannot be resolved");
    }
}
