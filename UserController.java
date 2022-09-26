package com.ty.controller;

import com.ty.dao.UserDAO;
import com.ty.dto.User;

public class UserController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO userDAO = new UserDAO();
		User user = new User();
	/*	user.setName("kavya");
		user.setEmail("kavya@123");
		user.setPassword("123456");
		user.setGender("female");
		user.setPhone(9113250628l);
		userDAO.saveUser(user);                   //insert user
		System.out.println("inserted");*/
	/*	userDAO.deleteUser(3);              //delete user
		System.out.println("deleted");*/
	/*	userDAO.findUserById(2);            //find user
		System.out.println("student is searching");*/
		
		user.setName("shiva");
		user.setEmail("shivu@123");
		user.setPassword("12345");
		user.setGender("male");
		user.setPhone(9113250629l);
		userDAO.updateUser(user);             //update user
		System.out.println("updated suceessfully");
	

	}

}
