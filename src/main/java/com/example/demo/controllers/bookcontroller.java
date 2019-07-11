package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.book.bookService;
import com.example.demo.book.bookVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookcontroller{
    @Autowired
    private bookService bookservice;
    private bookVO vos;

    @GetMapping(value = "/getbooks")
    public ArrayList<bookVO> getbooks(){
        ArrayList<bookVO> bookList = bookservice.getbook();
        return bookList;
    }

    @PostMapping(value = "/insertbook")
    public String insertbook(@RequestBody bookVO vo){
        bookservice.insertbook(vo);
        return "true";
    }

    @PostMapping(value = "/updatebook")
    public String updatebook(@RequestBody bookVO vo){
        bookservice.updatebook(vo);
        return "true" ;
    }
    @PostMapping(value = "/deletebook/{isbn}")
    public String deletebook(@RequestBody bookVO vo){
        
        String isbn = vo.getIsbn();
        System.out.println(isbn);
        bookservice.deletebook(isbn);
        return "delete sucess";
    }
    
    

}