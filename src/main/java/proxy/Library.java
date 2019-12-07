package proxy;

import java.util.List;

public interface Library {
    List<Book> listBooks();
    void getBookInfo(Integer id);
    Book borrowBook(Integer id, String name);
}
