
import java.util.LinkedList;
import java.util.List;

public class Bookshop implements Cloneable {
    List<Book> books = new LinkedList<>();
    public Bookshop() {
    }
    public Bookshop(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Bookshop [books=" + books + "]";
    }
    @Override
    public Bookshop clone() throws CloneNotSupportedException{
        // Could have done return super.clone and return type as Object
        //But it will return a shallow copy. Just a reference to the same obejct.
        Bookshop bClone = new Bookshop(); 
        for(Book b : this.getBooks())
            bClone.getBooks().add(b);
        return bClone;
    }
    
}
