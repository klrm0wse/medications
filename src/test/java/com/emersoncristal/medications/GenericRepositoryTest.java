package com.emersoncristal.medications;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import com.emersoncristal.medications.repository.GenericRepository;


@SpringBootTest(classes = MedicationsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GenericRepositoryTest {

	@Autowired
	private GenericRepository genericRepository;
	
	private PageRequest request;
		
	@Test
	void testGenericAndBrands() {
		// test whether genericAndBrands() returns the query result
		assertNotNull(genericRepository.genericAndBrands(request));
	}
	
}
