package com.website.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.website.dao.UserDAO;
import com.website.entity.Users;

public class UserServices {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private UserDAO userDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public UserServices(EntityManager entityManager, HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.entityManager = entityManager;
		userDAO = new UserDAO(entityManager);
	}

	public void listUsers() {
		List<Users> listUsers = userDAO.listAll();
	}
	
	public void createUsers() {		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String fullName = request.getParameter("fullname");
		String userName = request.getParameter("username");
		
		Users existUser = userDAO.findByEmail(email);
		if(existUser != null){
			//TO DO: show error message to user
		}
		//TODO: check findByUsername
		else {
			Users newUser = new Users(fullName, email, password, userName);
			userDAO.create(newUser);
		}
	}
	public void login(){
		String email = request.getParameter("email");
		String password = request.getParameter("password");		
	}
	
	public void editUser() {
		
	}
}
