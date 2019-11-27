/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.List;

/**
 *
 * @author student
 */
public interface Library {
    List<Book> listBooks();
    void getBookInfo(Integer id);
    Book borrowBook(Integer id);
}
