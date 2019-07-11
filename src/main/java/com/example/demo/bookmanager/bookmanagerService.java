package com.example.demo.bookmanager;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

public interface bookmanagerService{
    void insertmanager(bookmanagerVO vo);
    String loginmanager(String id, String pw);
    ArrayList<bookmanagerVO> getbook();
}