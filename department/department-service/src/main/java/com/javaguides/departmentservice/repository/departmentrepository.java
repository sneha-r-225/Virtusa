package com.javaguides.departmentservice.repository;

import com.javaguides.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departmentrepository extends JpaRepository<Department, Long> {
}
