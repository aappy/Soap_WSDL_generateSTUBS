package com.apex.service;

import java.rmi.RemoteException;
import java.util.Calendar;

import com.apex.service.vo.Employee;

public class Client {
	public static void main(String[] args) throws RemoteException {
		
		MyServiceProxy proxy = new MyServiceProxy();
		
		String var1 = proxy.sayHello();
		String var2 = proxy.sayHelloWithName("Aparna");
		int var3 = proxy.add(10, 20);
		
		Calendar cal = proxy.getServerDate();
		
		Employee emp = proxy.getEmployee(10);
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(cal);
		System.out.println(emp.getName());
		
	}
}
