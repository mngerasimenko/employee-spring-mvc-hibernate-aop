package ru.mngerasimenko.employee.dao;

import ru.mngerasimenko.employee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAll();

    void save(Employee employee);

    Employee getById(int id);
}
