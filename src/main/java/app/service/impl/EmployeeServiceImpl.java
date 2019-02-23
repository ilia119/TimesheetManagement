package app.service.impl;

import app.beans.Employee;
import app.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> getEmployees() {
        return Employee.getEmployees();
    }
}
