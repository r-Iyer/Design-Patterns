import java.util.List;

public interface Iterator<T> {
    boolean next();
    boolean hasNext();
    T get();
    List<T> getIterable();
    void setIterable(List<T> iterable);
}
