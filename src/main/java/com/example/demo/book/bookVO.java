package com.example.demo.book;


public class bookVO{
    private String isbn;
    private String bookname;
    private int stock;
    private String author;
    private String type;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "bookVO [author=" + author + ", bookname=" + bookname + ", isbn=" + isbn + ", stock=" + stock + ", type="
                + type + "]";
    }

    public bookVO(String isbn, String bookname, int stock, String author, String type) {
        this.isbn = isbn;
        this.bookname = bookname;
        this.stock = stock;
        this.author = author;
        this.type = type;
    }

}