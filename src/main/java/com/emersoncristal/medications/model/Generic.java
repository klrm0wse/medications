package com.emersoncristal.medications.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "generic")
@NoArgsConstructor
public class Generic {
	// Java class entity, to model generic medication (with attributes Id and name), that has oneToMany relationship with Brands medication (intermediate/mapping stored in 'brandList')
	@Id
	@Column(name = "generic_id")
	private int id;
	
	@Column(name = "generic_name", columnDefinition = "varchar(60)")
	private String name;
	
	@OneToMany(targetEntity = Brands.class)
	private List<Brands> brandList = new ArrayList<Brands>();
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Brands> getBrandList() {
		return brandList;
	}

	public void setBrandList(List<Brands> brandList) {
		this.brandList = brandList;
	}

	
}
