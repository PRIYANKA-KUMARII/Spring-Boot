package com.nit.sbeans;


public class Library {
    private final Book book;

    public Library(Book book) {
        this.book = book;
    }

    public void showBook() {
        System.out.println("Library holds: " + book.getTitle());
    }
}
