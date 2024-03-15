package com.example.Securitydemo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Securitydemo.models.Users;


public interface UserRepository extends JpaRepository<Users, Long>  {
	Users findByEmail(String eamil);
}
