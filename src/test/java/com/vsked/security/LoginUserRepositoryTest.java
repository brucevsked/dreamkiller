package com.vsked.security;

import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import com.vsked.test.BaseTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginUserRepositoryTest extends BaseTest {
	
	@Resource
	LoginUserRepository loginUserRepository;
	
	@Test
	public void login() {
		String username="a";
		String userpass="a";
		LoginUser loginUser=loginUserRepository.findByUsernameAndUserpass(username, userpass);
		log.info(loginUser.getUsername()+loginUser.getUserpass());
	}

}
