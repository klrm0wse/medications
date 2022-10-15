package com.emersoncristal.medications.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersoncristal.medications.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	// repository interface for Spring Security
    Role findByName(String name);
}