public class Assemble implements IWorkshop{

    @Override
    public void work() {
        System.out.println("Assembling...");        
    }

    @Override
    public String toString() {
        return "Assemble []";
    }

}
