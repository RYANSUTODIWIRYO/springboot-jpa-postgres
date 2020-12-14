package com.springjpapostgres.repository;

import com.springjpapostgres.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    @Query(value = "SELECT * FROM employee ORDER BY id ASC", nativeQuery = true)
    List<Employee> findAll();

//    @Query(value = "SELECT employee.name, position.name as position " +
//            "FROM employee INNER JOIN position " +
//            "ON employee.position_id = position.id " +
//            "ORDER BY employee.id ASC",
//            nativeQuery = true)
//    List<Object[]> findAllWithPosition();
}
