package com.example.demo.bookmanagerimpl;

import java.util.ArrayList;

import com.example.demo.book.bookService;
import com.example.demo.bookmanager.bookmanagerService;
import com.example.demo.bookmanager.bookmanagerVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookmanagerservice")
public class managerserviceimpl implements bookmanagerService{
    @Autowired
    private bookmanagerDAO bookmanagerdao;

    public void insertmanager(bookmanagerVO vo) {
        bookmanagerdao.insertmanager(vo);
    }
    public String loginmanager(String id,  String pw){
        return bookmanagerdao.login(id, pw);
    }
    public ArrayList<bookmanagerVO> getbook(){
        return bookmanagerdao.getbook();
    }
}