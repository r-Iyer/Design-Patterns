import java.util.Scanner;

public class ProductSelectedState implements IState{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void handleRequest() {
        System.out.println("Product is in Product Selected state. Press Enter to Go to next State.");
        scanner.nextLine();
    }
    @Override
    public void printCurrentState() {
        System.out.println("Product is in Payment Selected state.");
    }

}
