package com.vsked.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUserRepository extends JpaRepository<LoginUser, Integer>{
	
	LoginUser findByUsernameAndUserpass(String username,String userpass);

}
