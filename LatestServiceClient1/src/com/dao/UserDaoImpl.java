package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.Util;
import com.vo.User;

public class UserDaoImpl {

	public void insertUser(User user) throws SQLException  {
		
		System.out.println("inside UserDAO");
		System.out.println(user.getFirstName());
		String sql="insert into usr"+"(firstname, middlename, lastname) values"
				+"(?,?,?);";
		
		Connection connection = null;
		
		try {
			connection = Util.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,user.getFirstName());
			ps.setString(2,user.getMiddleName());
			ps.setString(3,user.getLastName());
			//ps.executeUpdate();
	
			System.out.println(" is closing the connection");
	
			int i = ps.executeUpdate();
			ps.close();
	        if (i > 0) {
	           System.out.println("You are successfully registered...");
		    }
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {			
//			connection.close();
		 }	
	}
}
