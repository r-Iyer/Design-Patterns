public class AmericanFactory implements IFactory{

    @Override
    public ICar createCar() {
        System.out.println("Created Sedan");
        return new Sedan();
    }
}
