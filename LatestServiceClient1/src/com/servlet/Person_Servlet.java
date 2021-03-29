package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.BoImpl;
import com.service.UserValidateServiceImplProxy;
import com.vo.User;

@WebServlet("/personadd")
public class Person_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Person_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UserValidateServiceImplProxy obj = new UserValidateServiceImplProxy();
		
		User u1 = new User();
		
		String s1 = request.getParameter("firstName");
		String s2 = request.getParameter("middleName");
		String s3 = request.getParameter("lastName");
		
		u1.setFirstName(s1);
		u1.setMiddleName(s2);
		u1.setLastName(s3);
		
		String s4 = obj.validateUser(u1);
		
		System.out.println(s4);
		
		BoImpl boimpl = new BoImpl();
		try {
			boimpl.putUser(u1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
