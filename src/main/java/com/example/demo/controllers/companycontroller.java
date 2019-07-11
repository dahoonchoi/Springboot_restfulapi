package com.example.demo.controllers;

import com.example.demo.book.bookVO;
import com.example.demo.company.companyService;
import com.example.demo.company.companyVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class companycontroller{
    @Autowired
    private companyService companyservice;

    @PostMapping(value = "/insertcompany")
    public String insertcompany(@RequestBody companyVO vo){
        companyservice.insertcompany(vo);
        return "true";
    }
    @PostMapping(value = "/bookorder")
    public String bookorder(@RequestBody companyVO comvo){
        System.out.println("asdf");
        String company = comvo.getId();
        // String isbn = bookvo.getIsbn();

        companyservice.bookordercompany(company);

        return "true";



    }
}