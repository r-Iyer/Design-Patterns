public class CoffeeMaker extends BeverageMaker{

    @Override
    void brew() {
        System.out.println("Drip coffee through filter.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk.");
    }

}
