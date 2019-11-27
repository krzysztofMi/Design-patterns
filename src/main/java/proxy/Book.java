/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author student
 */
public class Book {
    String title;
    String author;
    Integer pageNumbers;

    public Book(String title, String author, Integer pageNumbers) {
        this.title = title;
        this.author = author;
        this.pageNumbers = pageNumbers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
    }
    
    @Override
    public String toString(){
        return "Title: " + title + ". Author: " + author + ". PageNumbers: " + pageNumbers;
    }
    
}
