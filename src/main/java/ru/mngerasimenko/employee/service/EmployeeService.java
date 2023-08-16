package ru.mngerasimenko.employee.service;

import ru.mngerasimenko.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();
    void save(Employee employee);

}
