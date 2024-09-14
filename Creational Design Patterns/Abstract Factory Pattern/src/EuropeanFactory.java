public class EuropeanFactory implements IFactory{

    @Override
    public ICar createCar() {
        System.out.println("Created Hatchback");
        return new Hatchback();
    }
}
