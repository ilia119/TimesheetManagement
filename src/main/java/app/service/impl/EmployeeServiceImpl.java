package app.service.impl;

import app.beans.Employee;
import app.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> getEmployees() {
        return Employee.getEmployees();
    }
}
