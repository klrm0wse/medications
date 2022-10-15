package com.emersoncristal.medications;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.emersoncristal.medications.repository.RoleRepository;
import com.emersoncristal.medications.repository.UserRepository;
import com.emersoncristal.medications.service.UserService;

@SpringBootTest(classes = MedicationsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserServiceTest {
	
	@Autowired
	private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private UserService userService = new UserService(userRepository, roleRepository, passwordEncoder);

	@Test
	void testFindAllUsers() {
		//test whether .findAllUsers() returns the query result
		assertNotNull(userService.findAllUsers());
	}

}
