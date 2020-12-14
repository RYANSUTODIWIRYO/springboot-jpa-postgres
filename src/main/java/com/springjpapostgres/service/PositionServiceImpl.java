package com.springjpapostgres.service;

import com.springjpapostgres.model.Position;
import com.springjpapostgres.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{

    @Autowired
    PositionRepository repository;

    @Override
    public List<Position> findAll() {
        return repository.findAll();
    }

    @Override
    public Position save(Position position) {
        return repository.save(position);
    }
}
