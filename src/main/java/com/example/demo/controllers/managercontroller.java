package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.book.bookService;
import com.example.demo.bookmanager.bookmanagerService;
import com.example.demo.bookmanager.bookmanagerVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class managercontroller{
    @Autowired
    private bookmanagerService managerservice;

    @PostMapping(value = "/insertmanager")
    public String insertmanager(@RequestBody bookmanagerVO vo){
        managerservice.insertmanager(vo);
        return "true";
    }
    @PostMapping(value="/loginmanager")
    public String getMethodName(@RequestBody bookmanagerVO vo) {
        
        String managerid = vo.getManagerid();
        String managerpassword = vo.getManagerpassword();
        
        managerservice.loginmanager(managerid, managerpassword);

        
        if(managerservice.loginmanager(managerid, managerpassword) != null){
                return managerid;
        }
        return "not id,password";
    }
    @GetMapping(value="/getmanager")
    public  ArrayList<bookmanagerVO> getmanager(){
        ArrayList<bookmanagerVO> bookList = managerservice.getbook();
        return bookList;
    }
    
}