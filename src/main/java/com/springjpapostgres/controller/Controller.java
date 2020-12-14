package com.springjpapostgres.controller;

import com.springjpapostgres.model.Employee;
import com.springjpapostgres.model.Position;
import com.springjpapostgres.service.EmployeeService;
import com.springjpapostgres.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    PositionService positionService;

    @GetMapping("/")
    public ResponseEntity<?> findAllEmployee() {
        return new ResponseEntity<>(employeeService.findAllEmployee(), HttpStatus.OK);
    }

    @PostMapping("/addemployee")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.save(employee), HttpStatus.OK);
    }

    @RequestMapping(value = "/position", method = RequestMethod.GET)
    public ResponseEntity<?> findAllPosition(){
        return new ResponseEntity<>(positionService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/addposition", method = RequestMethod.POST)
    public ResponseEntity<?> addEmployee(@RequestBody Position position) {
        return new ResponseEntity<>(positionService.save(position), HttpStatus.OK);
    }

}
