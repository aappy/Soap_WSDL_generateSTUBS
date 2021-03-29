package com.bo;

import java.sql.SQLException;

import com.dao.UserDaoImpl;
import com.vo.User;

public class BoImpl {

	public void putUser(User user) throws SQLException {
	
		UserDaoImpl obj = new UserDaoImpl();
		obj.insertUser(user);
		
	}
}
