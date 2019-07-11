package com.example.demo.companyimpl;

import com.example.demo.company.companyService;
import com.example.demo.company.companyVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("companyService")
public class companyserviceimpl implements companyService{
    @Autowired
    private companyDAO companydao;

    public void insertcompany(companyVO vo){
        companydao.insertcompany(vo);
    }

   public String bookordercompany(String id){
       return companydao.bookorder(id);
   }

}