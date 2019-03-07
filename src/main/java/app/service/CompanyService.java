package app.service;

import app.entities.Company;
import app.entities.Employee;
import app.entities.Project;
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

    void edit(Company company);
}
