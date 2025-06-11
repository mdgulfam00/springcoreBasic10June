package com.springcore.homeWork26;

import java.util.HashMap;
import java.util.Map;

public class BookServiceImpl implements BookService{

    private Map<String,Book> bookInventory = new HashMap<>();

    public Map<String, Book> getBookInventory() {
        return bookInventory;
    }

    public void setBookInventory(Map<String, Book> bookInventory) {
        this.bookInventory = bookInventory;
    }

    @Override
    public void addBook(Book book) {
        bookInventory.put(book.getIsbn(), book);
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        return bookInventory.get(isbn);
    }
    public void display(){
        for(Map.Entry<String,Book> e:bookInventory.entrySet()){
            System.out.println("Book Id: "+e.getValue().getId()+
                    "::: Book Name: "+e.getValue().getName()+
                    "::: Book Author:"+e.getValue().getAuthor()+
                    "::: Book ISBN: "+e.getValue().getIsbn()
            );
        }
    }
}
