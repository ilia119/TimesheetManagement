package app.server.service;

import app.server.entities.Company;
import app.server.entities.Employee;
import app.server.entities.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {

    void addEmployee(Company company, Employee employee);

    void addProject(Company company, Project project);

    List<Employee> getEmployees(Company company);

    List<Project> getProjects(Company company);

    List<Company> getCompanies();

    Company findById(int id);

    void save(Company company);

    void delete(Company company);

    void delete(int id);
}
