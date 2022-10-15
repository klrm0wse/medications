package com.emersoncristal.medications.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "brands")
@NoArgsConstructor
public class Brands {
	// Java class entity, to model Brand medication (with attributes Id and name), which is the target class of oneToMany relationship with source entity=Generic.java
	@Id
	@Column(name = "brand_id")
	private int id;
	
	@Column(name = "brand_name", columnDefinition = "varchar(60)")
	private String name;

	
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

	@Override
	public String toString() {
		return name;			
		
	}

		
}
