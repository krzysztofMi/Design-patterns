/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author student
 */
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
    
    public List<Book> listBooks() {
        return this.books;
    }

    public void getBookInfo(Integer id) {
        System.out.println(books.get(id).toString());
    }

    public Book borrowBook(Integer id, String name) {
        Book book = books.get(id);
        books.remove(id);
        borrowedBooks.put(book, name);
        return book;
    }
    
}
