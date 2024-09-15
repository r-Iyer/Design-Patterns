public class TeaMaker extends BeverageMaker{

    @Override
    void brew() {
        System.out.println("Steep the tea.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add lemon.");
    }

}
