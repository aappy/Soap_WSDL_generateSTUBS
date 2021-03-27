package com.apex.service;

import java.util.Date;

import com.apex.service.vo.Employee;

public class MyService {

	public String sayHello() {
		return "Hello ALL";
	}
	
	public String sayHelloWithName(String name) {
		return "Hello" + name;
	}
	
	public int add(int num1 , int num2) {
		return num1 + num2;
	}
	
	public Date getServerDate() {
		Date dt = new Date();
		return dt;
	}
	
	public Employee getEmployee(int id) {
		
		Employee emp = new Employee();
		
		emp.setId(id);
		emp.setName("Aparna");
		emp.setAddress("734 n ln ");
		emp.setCity("Dublin");
		emp.setState("CA");
		emp.setZipcode("123456");
		emp.setSalary(1000 + id);
		return emp;
	}
	
}
//http://localhost:8080/my-test-service/services/MyService