package com.springjpapostgres.service;

import com.springjpapostgres.model.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public interface EmployeeService {
    public abstract List<Employee> findAllEmployee();
//    List<HashMap<String, Object>> findAllEmployee();
    public abstract Employee save(Employee employee);
}
