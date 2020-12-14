package com.springjpapostgres.service;

import com.springjpapostgres.model.Position;

import java.util.List;

public interface PositionService {
    public abstract List<Position> findAll();
    public abstract Position save(Position position);
}
