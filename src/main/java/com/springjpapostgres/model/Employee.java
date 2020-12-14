package com.springjpapostgres.model;

import javax.persistence.*;

@Entity
@Table(schema = "myschema", name = "employee")
public class Employee {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
    @SequenceGenerator(name = "employee_generator", sequenceName = "employee_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    private String name;

    @ManyToOne
    private Position position;

    public Employee(long id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    protected Employee() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
