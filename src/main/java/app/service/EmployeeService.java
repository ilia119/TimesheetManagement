package app.service;

import app.entities.Employee;

public interface EmployeeService {

    Employee findById(int id);

    void save(Employee employee);

    void delete(Employee employee);
}
