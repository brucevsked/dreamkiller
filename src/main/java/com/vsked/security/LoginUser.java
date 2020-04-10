package com.vsked.security;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="loginuser")
public class LoginUser {
	
	@Id
	private String userid;
	private String username;
	private String userpass;
	private String equipment;

}
