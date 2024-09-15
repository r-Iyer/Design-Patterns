
import java.util.ArrayList;

public class SelectionSortStrategy implements SortingStrategy{

    @Override
    public void sort(ArrayList<Integer> numbers) {
        for(int i=0;i<numbers.size()-1;i++) {
            int s = i;
            for(int j=i+1;j<numbers.size();j++) {
                if(numbers.get(j) < numbers.get(s))
                    s = j;
            }
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(s));
            numbers.set(s, temp);
        }
    }
}
