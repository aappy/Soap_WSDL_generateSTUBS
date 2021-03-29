package com.client;

import java.rmi.RemoteException;
import com.service.UserValidateServiceImplProxy;
import com.vo.User;

public class Client {

	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("");
		user.setMiddleName("a");
		user.setLastName("123");
		
		UserValidateServiceImplProxy proxy = new UserValidateServiceImplProxy();
		try {
			System.out.println(proxy.validateUser(user));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


