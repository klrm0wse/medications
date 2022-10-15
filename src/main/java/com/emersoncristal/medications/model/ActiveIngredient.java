package com.emersoncristal.medications.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

//@Data
@Entity
@Table(name = "active_ingredient")
@NoArgsConstructor
public class ActiveIngredient {
	//Java class entity, to model medication formulation (or active ingredient/s), with attributes Id, drugClass, and indication; source entity of oneToOne relationship - target class is Generic.java
	@Id
	@Column(name  = "activeIngredient_id")
	private int id;
	
	@Column(name = "drug_class", columnDefinition = "varchar(60)")
	private String drugClass;
	
	@Column(name = "indication")
	private String indication;
	
	@OneToOne
	@PrimaryKeyJoinColumn(name = "activeIngredient_id", referencedColumnName = "generic_id")
	private Generic generic;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDrugClass() {
		return drugClass;
	}

	public void setDrugClass(String drugClass) {
		this.drugClass = drugClass;
	}

	public String getIndication() {
		return indication;
	}

	public void setIndication(String indication) {
		this.indication = indication;
	}

	public Generic getGeneric() {
		return generic;
	}

	public void setGeneric(Generic generic) {
		this.generic = generic;
	}

	
}
