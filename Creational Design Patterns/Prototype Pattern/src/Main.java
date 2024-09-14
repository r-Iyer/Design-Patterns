
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("Harry Potter", "JK Rowling", 200);
        Book book2 = new Book("Famous Five", "Enid Blyton", 100);
        Book book3 = new Book("Mahabharat", "Ved Vyas", 500);
        List<Book> books = new LinkedList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Bookshop rohitBookShop = new Bookshop(books);
        System.out.println(rohitBookShop.toString());
        Bookshop rahulBookshop = rohitBookShop.clone();
        System.out.println(rahulBookshop.toString());

        System.out.println("After remove");
        rohitBookShop.getBooks().remove(0);
        System.out.println(rohitBookShop.toString());
        System.out.println(rahulBookshop.toString());
    }
}
