package app.service;

import app.entities.Employee;
import app.entities.Project;

public interface EmployeeService {

    void assignToProject(Employee employee, Project project);

    Employee findById(int id);

    void save(Employee employee);

    void delete(Employee employee);
}
