package com.digital_employee.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital_employee.DigitalEmployeeApplication;


@Repository
public interface DigitalEmployeeRepository extends JpaRepository<DigitalEmployeeApplication, Long> {

	Optional<DigitalEmployeeApplication>findByUserEmail(String userEmail);
}
