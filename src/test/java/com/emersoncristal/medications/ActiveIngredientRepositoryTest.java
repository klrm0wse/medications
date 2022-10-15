package com.emersoncristal.medications;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import com.emersoncristal.medications.repository.ActiveIngredientRepository;

@SpringBootTest(classes = MedicationsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ActiveIngredientRepositoryTest {

	
	@Autowired
	private ActiveIngredientRepository activeIngredientRepository;
	
	private PageRequest request;	
	
	@Test
	void testGenBrDrugClassIndication() {
		// test whether genBrDrugClassIndication() returns the query result
		assertNotNull(activeIngredientRepository.genBrDrugClassIndication(request));
	}
	
}
