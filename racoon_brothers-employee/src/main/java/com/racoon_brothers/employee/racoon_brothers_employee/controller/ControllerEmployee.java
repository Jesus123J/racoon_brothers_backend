package com.racoon_brothers.employee.racoon_brothers_employee.controller;

import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("api/employee")
public class ControllerEmployee {


     @GetMapping("/employee-list")
     @ResponseStatus(HttpStatus.OK)
     public ResponseEntity<?> listEmployee(){

         System.out.println("liST");

         return ResponseEntity.ok("");
     }


}
