package com.example.demo.userimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.demo.common.JDBCUtil;
import com.example.demo.users.usersvo;

import org.springframework.stereotype.Repository;

@Repository
public class userDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	private final String BOARD_INSERT = "insert into user(address, birth, email, name, phonenum) values(?,?,?,?,?)";
	private final String GET_USERS = "SELECT * FROM user";
	
	public void insertuser(usersvo vo) {
		System.out.println("===> JDBC로 insertBoard() 기능 처리");
		try {
			System.out.println(vo.toString());
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, vo.getAddress());
			stmt.setString(2, vo.getBirth());
			stmt.setString(3, vo.getEmail());
			stmt.setString(4, vo.getName());
			stmt.setString(5, vo.getPhonenum());
			// System.out.println(vo.getAddress());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	public ArrayList<usersvo> getuser() {
		System.out.println("===> JDBC로 getuser() 기능 처리");
		ArrayList<usersvo> userList = new ArrayList<>();
		try {

			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(GET_USERS);
			rs = stmt.executeQuery();
			while (rs.next()) {
				userList.add(new usersvo(rs.getString("address"), rs.getString("birth"), rs.getString("email"),
						rs.getString("name"), rs.getString("phonenum")));
			}
			System.out.println(userList);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}

		return userList;
	}

}