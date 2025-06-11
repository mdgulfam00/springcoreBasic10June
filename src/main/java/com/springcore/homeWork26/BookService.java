package com.springcore.homeWork26;




public interface BookService {
    void addBook(Book book);
    Book getBookByIsbn(String isbn);
}
