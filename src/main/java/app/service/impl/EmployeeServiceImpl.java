package app.service.impl;

import app.entities.Employee;
import app.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> getAll() {
        return Employee.getAll();
    }
}
