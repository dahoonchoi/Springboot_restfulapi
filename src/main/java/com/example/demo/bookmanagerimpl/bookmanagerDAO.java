package com.example.demo.bookmanagerimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.demo.bookmanager.bookmanagerVO;
import com.example.demo.common.JDBCUtil;

import org.springframework.stereotype.Repository;

@Repository
public class bookmanagerDAO {
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    private final String MANAGER_INSERT = "insert into bookmanage(managerid, MANAGERPW, auth) values(?, ?, ?)";
    private final String MANAGER_LOGIN = "select * from bookmanage where managerid=? AND MANAGERPW=?";
    private final String MANAGER_GET = "select * from bookmanage";
    
    public void insertmanager(bookmanagerVO vo){
        System.out.println("===> JDBC로 insertmanager 기능처리");
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(MANAGER_INSERT);
            stmt.setString(1, "BPSC"+vo.getManagerid());
            stmt.setString(2, vo.getManagerpassword());
            stmt.setString(3, vo.getAuth());
            stmt.executeUpdate();
        } catch (Exception e) {
        e.printStackTrace();
        }finally{
            JDBCUtil.close(stmt, conn);
        }
    }
    public String login(String id ,String pw) {
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(MANAGER_LOGIN);
            stmt.setString(1, id);
            stmt.setString(2, pw);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                    
                return id;
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            JDBCUtil.close(stmt, conn);
        }
        return null;
  
    }
    public ArrayList<bookmanagerVO> getbook(){
        ArrayList<bookmanagerVO> bookList = new ArrayList<>();

        try{
        
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(MANAGER_GET);
            rs = stmt.executeQuery();
            while(rs.next()){
                bookList.add(new bookmanagerVO(rs.getString("managerid"),rs.getString("MANAGERPW"),rs.getString("auth")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtil.close(stmt, conn);
        }
        return bookList;
    }
}