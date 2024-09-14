public class Produce  implements IWorkshop{

    @Override
    public void work() {
        System.out.println("Producing...");        
    }

    @Override
    public String toString() {
        return "Produce []";
    }

}
