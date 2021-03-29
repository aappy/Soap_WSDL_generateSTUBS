package com.service;

import com.vo.User;

public class UserValidateServiceImpl implements UserValidateService{

	@Override
	public String validateUser(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("First name should be more than two chars!!!!");
			return "First name is Error!!!!";			
		}
		else if(user.getLastName().length()<2) {
			System.out.println("LastName should be more than two chars!!!!");
			return "Last name is Error!!!!";			
		}		
		else if(user.getMiddleName().length()<2) {
			System.out.println("MiddleName should be more than two chars!!!!");
			return "Middle name is Error!!!!";			
		}		
		else {
			String s1 = "first name is "+ user.getFirstName()+"middle name is"+user.getMiddleName()+"last name is"+user.getLastName();
			return s1;
		}
    }
}