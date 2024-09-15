
import java.util.Scanner;

public class ReadyState implements IState{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void handleRequest() {
        System.out.println("Product is in Ready state. Press a enter continue to next state.");
        scanner.nextLine();
    }
    @Override
    public void printCurrentState() {
        System.out.println("Product is in Ready state.");
    }

}
