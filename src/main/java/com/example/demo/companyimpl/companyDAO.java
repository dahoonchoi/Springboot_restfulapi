package com.example.demo.companyimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.demo.common.JDBCUtil;
import com.example.demo.company.companyVO;

import org.springframework.stereotype.Repository;

@Repository
public class companyDAO {
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    private final String COMPANY_INSERT = "insert into company(id,name,condition,business,represent) values(?,?,?,?,?)";
    private final String COMPANY_ORDER = "insert into shipment(COMPANYID) values(?)";

    public void insertcompany(companyVO vo){
        try{
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(COMPANY_INSERT);
            stmt.setString(1, vo.getId());
            stmt.setString(2, vo.getName());
            stmt.setString(3, vo.getCondition());
            stmt.setString(4, vo.getBusiness());
            stmt.setString(5, vo.getRepresent());
            stmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JDBCUtil.close(stmt, conn);
        }
    }
    public String bookorder(String id){
        try{
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(COMPANY_ORDER);
            stmt.setString(1, id);
            stmt.executeUpdate();
      
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JDBCUtil.close(stmt, conn);
        }
        return null;
    }
   
}