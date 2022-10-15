package com.emersoncristal.medications;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.emersoncristal.medications.repository.RoleRepository;

@SpringBootTest(classes = MedicationsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RoleRepositoryTest {
	
	@Autowired
	private RoleRepository roleRepository;

	@Test
	void testFindByName() {
		// test whether .findByName() returns the result
		assertNotNull(roleRepository.findByName("ROLE_ADMIN"));
	}

}
