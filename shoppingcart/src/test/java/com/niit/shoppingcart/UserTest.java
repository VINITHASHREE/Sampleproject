package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.modal.User;
import com.niit.service.UserDAO;

public class UserTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		System.out.println("system.....");
		
	    UserDAO userDAO=(UserDAO) context.getBean("UserDAO");
		
		
		
		User user=(User) context.getBean("user");
		
		user.setUserName("vinitha");
		user.setEmailAddress("vinithashreeprabhakaran@gmail.com");
		user.setPassword("shree");
		user.setMobileNumber(9585);
		user.setAddress("Thennampalayam");
 
		userDAO.insertUser(user);


	}

}
