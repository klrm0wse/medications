package com.emersoncristal.medications;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.emersoncristal.medications.repository.UserRepository;

@SpringBootTest(classes = MedicationsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;

	@Test
	void testFindByEmail() {
		// test whether user can be retrieved by email
		assertNotNull(userRepository.findByEmail("admin@gmail.com"));
	}

}
