package com.emersoncristal.medications.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.emersoncristal.medications.model.Generic;

@Repository
public interface GenericRepository extends JpaRepository<Generic, Integer> {
	// repository interface, with custom query method
	@Query(value = "SELECT GENERIC_ID, GENERIC_NAME, GROUP_CONCAT(BRAND_NAME) AS 'BRANDS' "
			+ "FROM GENERIC_BRAND_LIST INNER JOIN GENERIC ON(generic.generic_id=generic_brand_list.generic_generic_id) INNER JOIN BRANDS ON(brands.brand_id=generic_brand_list.brand_list_brand_id) "
			+ "GROUP BY GENERIC_NAME "
			+ "ORDER BY GENERIC_ID ASC ", 
			countQuery = "SELECT COUNT(GENERIC_NAME), GENERIC_ID, GROUP_CONCAT(BRAND_NAME) AS 'BRANDS' "
					+ "FROM GENERIC_BRAND_LIST INNER JOIN GENERIC ON(generic.generic_id=generic_brand_list.generic_generic_id) INNER JOIN BRANDS ON(brands.brand_id=generic_brand_list.brand_list_brand_id) "
					+ "GROUP BY GENERIC_NAME "
					+ "ORDER BY GENERIC_ID ASC;", nativeQuery = true)
	Page<Generic> genericAndBrands(PageRequest request);
	
	
}
