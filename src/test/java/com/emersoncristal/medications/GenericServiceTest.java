package com.emersoncristal.medications;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.emersoncristal.medications.repository.GenericRepository;
import com.emersoncristal.medications.service.GenericService;

@SpringBootTest(classes = MedicationsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GenericServiceTest {
	
	@Autowired
	private GenericRepository genericRepository;
	
	@Autowired
	private GenericService genericService = new GenericService(genericRepository);
	
    @Test
	void testGetPage() {
    	// test whether getPage() from GenericService class returns the result
		assertNotNull(genericService.getPage(2, 5));
	}

}
