package com.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.dao.Flight;

public interface AdminRepository extends JpaRepository<Flight, Integer> {

}
