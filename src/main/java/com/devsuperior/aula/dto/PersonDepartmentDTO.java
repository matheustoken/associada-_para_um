package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDTO {

    private Long id;
    private String name;
    private Double salary;

    private DepartmentDTO department;


    public PersonDepartmentDTO(Long id, DepartmentDTO department, Double salary, String name) {
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.name = name;
    }

    public PersonDepartmentDTO(Person entity) {
        id = entity.getId();
        salary = entity.getSalary();
        name = entity.getName();
        department = new DepartmentDTO(entity.getDepartment());
    }


    public Long getId() {
        return id;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
