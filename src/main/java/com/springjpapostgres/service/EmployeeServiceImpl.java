package com.springjpapostgres.service;

import com.springjpapostgres.model.Employee;
import com.springjpapostgres.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> findAllEmployee() {
        return repository.findAll();
    }


//    @Override
//    public List<HashMap<String, Object>> findAllEmployee() {
//        List<HashMap<String, Object>> employee = new ArrayList<>();
//        List<Object[]> list = repository.findAllWithPosition();
//
//        for (Object[] obj : list) {
//            HashMap<String, Object> hashMap = new HashMap<String, Object>() {{
//                put("name", obj[0]);
//                put("position", obj[1]);
//            }};
//            employee.add(hashMap);
//        }
//
//        return employee;
//    }

    @Override
    public Employee save(Employee employee) {
        return repository.save(employee);
    }
}
