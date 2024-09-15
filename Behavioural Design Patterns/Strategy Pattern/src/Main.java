
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context1 = new Context(new SelectionSortStrategy());
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 2, 5, 1, 3));

        context1.sort(numbers);
        print(numbers);
    }
    static void print(ArrayList<Integer> numbers) {
        for(int i=0;i<numbers.size();i++)
            System.out.print(numbers.get(i) + " ");
        System.out.println();
    }
}
