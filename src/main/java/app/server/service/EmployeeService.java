package app.server.service;

import app.server.entities.Employee;
import app.server.entities.Project;
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
