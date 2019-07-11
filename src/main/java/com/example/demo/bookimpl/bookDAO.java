package com.example.demo.bookimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.demo.book.bookVO;
import com.example.demo.common.JDBCUtil;

import org.springframework.stereotype.Repository;

@Repository
public class bookDAO {
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    
    private final String BOOK_INSERT = "insert into book(isbn, bookname, stock, author, type) values(?,?,?,?,?)";
    private final String BOOK_SELECT = "select * from book";
    private final String BOOK_UPDATE = "update book set isbn = ? ,bookname = ?, stock = ? ,author = ?, type = ? where isbn =?";
    private final String BOOK_DELETE = "delete book where isbn=?";

    public void insertbook(bookVO vo) {
        System.out.println("===> JDBC로 book 기능 수행");
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(BOOK_INSERT);
            stmt.setString(1, "BPSC"+vo.getIsbn());
            stmt.setString(2, vo.getBookname());
            stmt.setInt(3, vo.getStock());
            stmt.setString(4, vo.getAuthor());
            stmt.setString(5, vo.getType());
            stmt.executeUpdate();

            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            JDBCUtil.close(stmt, conn);
        }
    }
    public ArrayList<bookVO> getbook() {
        System.out.println("===> getbbook처리");
        ArrayList<bookVO> bookList = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(BOOK_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {   
                bookList.add(new bookVO(rs.getString("isbn"), rs.getString("bookname"), rs.getInt("stock"),
                rs.getString("author"), rs.getString("type")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            JDBCUtil.close(stmt, conn);
        }
        return bookList;
    }
    public void updatebook(bookVO vo){
        try{
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(BOOK_UPDATE);
            stmt.setString(1, vo.getIsbn());
            stmt.setString(2, vo.getBookname());
            stmt.setInt(3, vo.getStock());
            stmt.setString(4, vo.getAuthor());
            stmt.setString(5, vo.getType());
            stmt.setString(6, vo.getIsbn());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            JDBCUtil.close(stmt, conn);
        }
    }
    public void deletebook(String vo){
        
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(BOOK_DELETE);
            stmt.setString(1, vo);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            JDBCUtil.close(stmt, conn);
        }
    }
}