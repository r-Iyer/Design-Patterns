
import java.util.ArrayList;

public class Context {
    SortingStrategy strategy;
    public void sort(ArrayList<Integer> numbers) {
        strategy.sort(numbers);
    }
    public Context(SortingStrategy strategy) {
        this.strategy = strategy;
    }
}
