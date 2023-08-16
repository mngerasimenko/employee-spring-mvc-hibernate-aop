package ru.mngerasimenko.employee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mngerasimenko.employee.dao.EmployeeDAO;
import ru.mngerasimenko.employee.entity.Employee;

import java.util.List;

@Controller
public class MyController {

    private final EmployeeDAO employeeDAO;

    @Autowired
    public MyController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "all_employees";
    }
}
