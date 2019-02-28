package app.service;

import app.entities.Employee;
import app.entities.Project;

import java.util.List;

public interface EmployeeService {

    void assignToProject(Employee employee, Project project);

    List<Employee> getEmployees();

    Employee findById(int id);

    void save(Employee employee);

    void delete(Employee employee);
}
