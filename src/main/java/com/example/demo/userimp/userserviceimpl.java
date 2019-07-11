package com.example.demo.userimp;

import java.util.ArrayList;

import com.example.demo.users.userservice;
import com.example.demo.users.usersvo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userservice")
public class userserviceimpl implements userservice{
    @Autowired
    private userDAO userdao;

    public void insertuser(usersvo vo){
        userdao.insertuser(vo);
    }

    public ArrayList<usersvo> getUser(){
        return userdao.getuser();
    }
}