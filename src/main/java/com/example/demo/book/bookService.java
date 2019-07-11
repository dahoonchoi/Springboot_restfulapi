package com.example.demo.book;

import java.util.ArrayList;

public interface bookService{
    void insertbook(bookVO vo);
    ArrayList<bookVO> getbook();
    void updatebook(bookVO vo);
    void deletebook(String vo);
}