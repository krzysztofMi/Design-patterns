
package proxy;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ProxyLibrary implements Library {

    List<Book> books;
    Map<Book, String> borrowedBooks;
    CityLibrary library;

    public CityLibrary getLibrary() {
        return library;
    }

    public ProxyLibrary(List<Book> books,
                        Map<Book, String> borrowedBooks){
        this.books = books;
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public List<Book> listBooks() {
        if(library == null){
            library = new CityLibrary(books, borrowedBooks);
        }
        return library.listBooks();
    }

    @Override
    public void getBookInfo(Integer id) {
        if(library == null){
            library = new CityLibrary(books, borrowedBooks);
        }
        library.getBookInfo(id);
    }

    @Override
    public Book borrowBook(Integer id, String name) {
        if(library == null){
            library = new CityLibrary(books, borrowedBooks);
        }
        Book borrowedBook = library.borrowBook(id, name);
        borrowedBooks.put(borrowedBook, name);
        return borrowedBook;
    }
}
