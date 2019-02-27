package app.service;

import app.entities.Employee;
import app.entities.Project;

public interface CompanyService {

    void addEmployee(Employee employee);

    void addProject(Project project);
}
