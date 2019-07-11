package com.example.demo.bookimpl;

import java.util.ArrayList;

import com.example.demo.book.bookService;
import com.example.demo.book.bookVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class bookServiceimpl implements bookService{
    @Autowired
    private bookDAO bookdao;

    public void insertbook(bookVO vo){
        bookdao.insertbook(vo);
    }

    public ArrayList<bookVO> getbook(){
        return bookdao.getbook();
    }

    public void updatebook(bookVO vo){
        bookdao.updatebook(vo);
    }
    public void deletebook(String vo) {
        bookdao.deletebook(vo);
    }
    
}