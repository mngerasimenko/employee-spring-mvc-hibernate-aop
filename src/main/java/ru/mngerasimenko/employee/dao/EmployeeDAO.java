package ru.mngerasimenko.employee.dao;

import ru.mngerasimenko.employee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
}
