
package proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityLibrary implements Library{
    
    List<Book> books;
    Map<Book, String> borrowedBooks;
    
    public CityLibrary(){
        books = new ArrayList<Book>();
        borrowedBooks = new HashMap<Book, String>();
    }
    
    public CityLibrary(ArrayList<Book> books){
        this.books = books;
        borrowedBooks = new HashMap<Book, String>();
    }

    public CityLibrary(List<Book> books, Map<Book, String> borrowedBooks){
        this.books = books;
        this.borrowedBooks = borrowedBooks;
    }
    
    public List<Book> listBooks() {
        return this.books;
    }

    @Override
    public void getBookInfo(Integer id) {
        System.out.println(books.get(id).toString());
    }

    @Override
    public Book borrowBook(Integer id, String name) {
        Book book = books.get(id);
        books.remove(id);
        borrowedBooks.put(book, name);
        return book;
    }
    
}
