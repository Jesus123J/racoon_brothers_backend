package com.racoon_brothers.employee.racoon_brothers_employee.repository;

import com.racoon_brothers.employee.racoon_brothers_employee.data.entity.EmployeeTb;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeTb , Integer> {
    @Query("SELECT e FROM EmployeeTb e WHERE e.fullName = :name")
    Optional<EmployeeTb> findByFullName(@Param("name") String name);
}
