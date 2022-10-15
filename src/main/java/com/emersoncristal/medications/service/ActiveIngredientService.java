package com.emersoncristal.medications.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.emersoncristal.medications.model.ActiveIngredient;
import com.emersoncristal.medications.model.paging.Paged;
import com.emersoncristal.medications.model.paging.Paging;
import com.emersoncristal.medications.repository.ActiveIngredientRepository;

@Service
public class ActiveIngredientService {
	// service class for ActiveIngredientRepository
	
	private final ActiveIngredientRepository activeIngredientRepository;
	
	@Autowired
	public ActiveIngredientService(ActiveIngredientRepository activeIngredientRepository) {
		this.activeIngredientRepository = activeIngredientRepository;
	}
	
	
	public Paged<ActiveIngredient> getPage(int pageNumber, int size) {
        PageRequest request = PageRequest.of(pageNumber - 1, size);
        Page<ActiveIngredient> postPage = activeIngredientRepository.genBrDrugClassIndication(request);
        return new Paged<>(postPage, Paging.of(postPage.getTotalPages(), pageNumber, size));
    }

}
