package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.PersistentMBean;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    DepartmentRepository departmentRepository;


 public PersonDepartmentDTO insert(PersonDepartmentDTO dto){
    Person entity = new Person();
    entity.setName((dto.getName()));
    entity.setSalary(dto.getSalary());

    Department department = departmentRepository.getReferenceById(dto.getDepartment().getId());
    department.setId(dto.getDepartment().getId());

    entity.setDepartment(department);
    entity = personRepository.save(entity);

    return new PersonDepartmentDTO(entity);




}





}
