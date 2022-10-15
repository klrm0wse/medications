package com.emersoncristal.medications;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.emersoncristal.medications.repository.ActiveIngredientRepository;
import com.emersoncristal.medications.service.ActiveIngredientService;

@SpringBootTest(classes = MedicationsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ActiveIngredientServiceTest {
	
	@Autowired
	private ActiveIngredientRepository activeIngredientRepository;	
	
	@Autowired
	private ActiveIngredientService activeIngredientService = new ActiveIngredientService(activeIngredientRepository);

	@Test
	void testGetPage() {
		// test whether getPage() from ActiveIngredientService class returns the result
		assertNotNull(activeIngredientService.getPage(3, 5));
	}

}
