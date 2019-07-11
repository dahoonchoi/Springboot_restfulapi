package com.example.demo.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.userimp.userDAO;
import com.example.demo.users.userservice;
import com.example.demo.users.usersvo;

import org.apache.catalina.Container;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class maincontroller{
    @Autowired
    private userservice userservice;

    @GetMapping(value = "/getbook")
    public ArrayList<usersvo> getbook(){
        ArrayList<usersvo> userList = userservice.getUser();
        return userList;
    }

    // @RequestMapping(value="/insertbook", method=RequestMethod.POST)
    @PostMapping(value = "/insertuser")
    public String insertbook1(@RequestBody usersvo vo){
        System.out.println(vo.toString());
        userservice.insertuser(vo);
        return "1";
    }

    
    
    
    
}