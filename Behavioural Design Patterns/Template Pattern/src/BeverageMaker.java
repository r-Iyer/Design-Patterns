public abstract class BeverageMaker {
    void prepareBeverage() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater() {
        System.out.println("Boil the water.");
    }
    void pourInCup() {
        System.out.println("Pour in Cup.");
    }
}
