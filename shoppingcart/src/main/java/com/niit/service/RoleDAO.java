package com.niit.service;

import java.util.List;

import com.niit.modal.User;

public interface RoleDAO {

	 public List<User> getAllUsers();
	   public User getUser(int userid);
	   public User insertUser(User user);
	   public void saveorupdateUser(User user);
	   public void deleteUser(User user);
	   public void deleteAllUser(User user);
	
}
