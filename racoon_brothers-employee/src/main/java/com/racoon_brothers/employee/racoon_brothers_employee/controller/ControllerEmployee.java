package com.racoon_brothers.employee.racoon_brothers_employee.controller;

import com.racoon_brothers.employee.racoon_brothers_employee.data.entity.EmployeeTb;
import com.racoon_brothers.employee.racoon_brothers_employee.service.EmployeeService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("api/employee")
public class ControllerEmployee {

    @Autowired
    EmployeeService employeeService;

     @GetMapping(value = "/employee-list" ,  produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<?> listEmployee(){
         System.out.println("List " + employeeService.listEmployee());
         return ResponseEntity.ok(employeeService.listEmployee());
     }

     @PostMapping(value = "/register-employee" ,  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createdEmployee(@RequestBody EmployeeTb employeeTb){
         return  employeeService.insertEmployee(employeeTb);
     }

}
