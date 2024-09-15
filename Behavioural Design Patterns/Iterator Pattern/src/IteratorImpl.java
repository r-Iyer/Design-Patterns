import java.util.List;

public class IteratorImpl<T> implements Iterator<T>{
    List<T> iterable;
    int currIndex;
    @Override
    public List<T> getIterable() {
        return iterable;
    }
    @Override
    public void setIterable(List<T> iterable) {
        this.iterable = iterable;
    }

    @Override
    public T get() {
        return iterable.get(currIndex);
    }

    @Override
    public boolean hasNext() {
        return this.currIndex+1 < this.iterable.size();
        
    }

    @Override
    public boolean next() {
        if(hasNext()) {
            this.currIndex++;   
            return true;
        }
        return false;     
    }

    public int getCurrIndex() {
        return currIndex;
    }

    public void setCurrIndex(int currIndex) {
        this.currIndex = currIndex;
    }

    public IteratorImpl() {
        this.currIndex = 0;
    }
}
