
import java.util.ArrayList;

public class BubbleSortStrategy implements SortingStrategy{

    @Override
    public void sort(ArrayList<Integer> numbers) {
        for(int i=0;i<numbers.size()-1;i++) {
            for(int j=0;j<numbers.size()-i-1;j++) {
                if(numbers.get(j) > numbers.get(j+1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j+1));
                    numbers.set(j+1, temp);
                }
            }
        }
    }
}
