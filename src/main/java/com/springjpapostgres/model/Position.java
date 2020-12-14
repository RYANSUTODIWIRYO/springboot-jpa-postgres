package com.springjpapostgres.model;

import javax.persistence.*;

@Entity
@Table(schema = "myschema", name = "position")
public class Position {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "position_generator")
    @SequenceGenerator(name = "position_generator", sequenceName = "position_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "name")
    private String positionName;

    public Position(long id, String positionName) {
        this.id = id;
        this.positionName = positionName;
    }

    protected Position() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
