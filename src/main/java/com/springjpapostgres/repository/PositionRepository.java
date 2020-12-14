package com.springjpapostgres.repository;

import com.springjpapostgres.model.Position;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PositionRepository extends CrudRepository<Position, Long> {

    @Override
    @Query(value = "SELECT * FROM position ORDER BY id ASC", nativeQuery = true)
    List<Position> findAll();
}
