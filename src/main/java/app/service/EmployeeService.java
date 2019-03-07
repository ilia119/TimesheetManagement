package app.service;

import app.entities.Employee;
import app.entities.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    void assignToProject(Employee employee, Project project);

    List<Employee> getEmployees();

    Employee findById(int id);

    void save(Employee employee);

    void delete(Employee employee);

    void delete(int id);

    void edit(Employee employee);
}
