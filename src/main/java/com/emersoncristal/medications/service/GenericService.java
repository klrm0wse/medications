package com.emersoncristal.medications.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.emersoncristal.medications.model.Generic;
import com.emersoncristal.medications.model.paging.Paged;
import com.emersoncristal.medications.model.paging.Paging;
import com.emersoncristal.medications.repository.GenericRepository;

@Service
public class GenericService {	
	// service class for GenericRepository
	private final GenericRepository genericRepository;
	
	@Autowired
	public GenericService(GenericRepository genericRepository) {
		this.genericRepository = genericRepository;
	}
	
	
	public Paged<Generic> getPage(int pageNumber, int size) {
        PageRequest request = PageRequest.of(pageNumber - 1, size);
        Page<Generic> postPage = genericRepository.genericAndBrands(request);
        return new Paged<>(postPage, Paging.of(postPage.getTotalPages(), pageNumber, size));
    }

}
