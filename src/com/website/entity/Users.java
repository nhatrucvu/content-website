package com.website.entity;
// Generated 24/03/2019 12:01:45 PM by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Users generated by hbm2java
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u ORDER BY u.fullName"),
	@NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email =:email"),
	@NamedQuery(name = "Users.checkLogin", query = "SELECT u FROM Users u WHERE u.email = :email AND u.password = :password"),
	@NamedQuery(name = "Users.countAll", query = "SELECT Count(*) FROM Users u")
})
@Table(name = "users", catalog = "websitedb", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Users implements java.io.Serializable {

	private Integer userId;
	private String userName;
	private String fullName;
	private String email;
	private String password;
	private Date registerDate;

	
	public Users() {
		super();
	}

	public Users(String fullName, String email, String password, String userName) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.userName = userName;
	}

	public Users(String userName, String fullName, String email, String password, Date registerDate) {
		this.userName = userName;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.registerDate = registerDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_name", nullable = false, length = 30)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "full_name", nullable = false, length = 30)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "email", unique = true, nullable = false, length = 64)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 16)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "register_date", nullable = true, length = 19)
	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

}
