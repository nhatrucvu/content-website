package com.website.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.website.entity.Users;


public class UserDAOTest {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UserDAO userDAO;
	
	@BeforeClass
	public static void setupClass() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emContentWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		userDAO = new UserDAO(entityManager);	
	}
	
	@Test
	public void testCreateUsers() {
		Users user1 = new Users();
		user1.setEmail("abcdDf@gmail.com");
		user1.setFullName("Ab Cd");
		user1.setUserName("AbCdDf");
		user1.setPassword("abcd");
		
		user1 = userDAO.create(user1);
		
		assertTrue(user1.getUserId() > 0);
	}
	
	@Test(expected = PersistenceException.class)
	public void testCreateUserFieldsNotSet() {
		Users user1 = new Users();
		
		user1 = userDAO.create(user1);
	}

	@Test
	public void testUpdateUsers() {
		Users user = new Users();
		user.setUserId(1);
		user.setEmail("name@gmail.com");
		user.setFullName("ABCS");
		
		
	}
	
	/*
	 * @Test public void testGetUsersFound() { Integer userId = 1; Users user =
	 * userDAO.get(userId); assertNotNull(user); }
	 */
	@Test
	public void testGetUsersNotFound() {
		Integer userId = 99;
		Users user = userDAO.get(userId);
		
		assertNull(user);
	}
	@Test
	public void testDeleteUsers() {
		Integer userId = 1;
		userDAO.delete(userId);		
		Users user = userDAO.get(userId);		
		assertNull(user);
	}
	@Test
	public void testDeleteUsersNotExist() {
		
	}
	@Test
	public void testListAll() {
		List<Users> listUsers = userDAO.listAll();
		
		for (Users user: listUsers) {
			System.out.println(user.getEmail());
		}
		assertTrue(listUsers.size() > 0);
	}
	
	@Test
	public void testCheckLogInSuccess() {
		String email = "abcdDf@gmail.com";
		String password = "abcd";
		boolean loginResult = userDAO.checkLogin(email, password);
		assertTrue(loginResult);
	}
	
	@Test
	public void testCheckLogInFailed() {
		String email = "abcdDf@gmail.com";
		String password = "abcde";
		boolean loginResult = userDAO.checkLogin(email, password);
		assertFalse(loginResult);
	}
	/*
	 * @AfterClass public static void tearDownClass() { entityManager.close();
	 * entityManagerFactory.close(); }
	 */
	
}
