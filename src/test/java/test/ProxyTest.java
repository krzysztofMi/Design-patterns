package test;


import org.junit.jupiter.api.Test;
import proxy.Book;
import proxy.Library;
import proxy.ProxyLibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProxyTest {

    @Test
    public void testProxy(){
        Book book1 = Book.builder().author("J.R.Tolkien").title("Władca Pierścieni").pageNumbers(1000).build();
        Book book2 = Book.builder().author("J.R.Tolkien").title("Silmarillion").pageNumbers(900).build();
        Book book3 = Book.builder().author("H.P. Lovecraft").title("Opowiadania").pageNumbers(550).build();
        Book book4 = Book.builder().author("Stanisław Lem").title("Solaris").pageNumbers(445).build();
        Book book5 = Book.builder().author("Adam Mickiewicz").title("Pan Tadeusz").pageNumbers(1000).build();
        Book book6 = Book.builder().author("Henryk Sienkiewicz").title("Potop").pageNumbers(1000).build();

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        Library library = new ProxyLibrary(books, new HashMap<>());
        ProxyLibrary library1 =(ProxyLibrary) library;
        assertTrue(library1.getLibrary() == null);
        assertTrue(library1.listBooks().size() == 6);
        assertTrue(library1.borrowBook(1, "Tomek").getTitle().equals("Silmarillion"));
        assertTrue(library1.getLibrary() != null);
        
    }
}
