package com.emersoncristal.medications.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersoncristal.medications.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	// repository interface for Spring Security
    User findByEmail(String email);

}
