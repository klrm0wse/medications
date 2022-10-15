package com.emersoncristal.medications.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.emersoncristal.medications.model.ActiveIngredient;

@Repository
public interface ActiveIngredientRepository extends JpaRepository<ActiveIngredient, Integer> {
	// repository interface, with custom query method
	@Query(value = "SELECT active_ingredient_id, GENERIC_NAME AS 'Active Ingredient', GROUP_CONCAT(BRAND_NAME) AS 'BRANDS', DRUG_CLASS, INDICATION "
			+ "FROM GENERIC_BRAND_LIST INNER JOIN GENERIC ON(generic.generic_id=generic_brand_list.generic_generic_id) INNER JOIN BRANDS ON(brands.brand_id=generic_brand_list.brand_list_brand_id) INNER JOIN active_ingredient ON(generic.GENERIC_ID=active_ingredient.ACTIVE_INGREDIENT_ID) "
			+ "GROUP BY GENERIC_NAME "
			+ "ORDER BY GENERIC_ID ASC ",
			countQuery = "SELECT active_ingredient_id, GENERIC_NAME AS 'Active Ingredient', GROUP_CONCAT(BRAND_NAME) AS 'BRANDS', DRUG_CLASS, INDICATION "
					+ "FROM GENERIC_BRAND_LIST INNER JOIN GENERIC ON(generic.generic_id=generic_brand_list.generic_generic_id) INNER JOIN BRANDS ON(brands.brand_id=generic_brand_list.brand_list_brand_id) INNER JOIN active_ingredient ON(generic.GENERIC_ID=active_ingredient.ACTIVE_INGREDIENT_ID) "
					+ "GROUP BY GENERIC_NAME "
					+ "ORDER BY GENERIC_ID ASC;", nativeQuery = true)
	Page<ActiveIngredient> genBrDrugClassIndication(PageRequest request);

}
