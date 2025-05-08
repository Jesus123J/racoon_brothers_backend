package com.racoon_brothers.employee.racoon_brothers_employee.service;

import com.racoon_brothers.employee.racoon_brothers_employee.data.entity.EmployeeTb;
import com.racoon_brothers.employee.racoon_brothers_employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public ResponseEntity<?> insertEmployee(EmployeeTb employeeTb){

        employeeRepository.save(employeeTb);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee register");
    }
    public List<EmployeeTb> listEmployee(){
        return employeeRepository.findAll();
    }

}
