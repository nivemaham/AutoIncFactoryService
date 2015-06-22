package com.autoinc.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.autoinc.bdo.User;

@Entity
@Table(name = "user")
public class UserDAO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "emailaddress")
	private String emailAddress;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	public UserDAO() {
	}

	public UserDAO(String userName,
			String password, String role,String emailAddress) {
		super();
		this.emailAddress = emailAddress;
		this.role = role;
		this.userName = userName;
		this.password = password;
	}

	public UserDAO(User user)
	{
		this.emailAddress = user.getEmailAddress();
		this.password = user.getPassword();
		this.id = user.getId();
		this.role = user.getRole();
		this.userName = user.getUserName();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
