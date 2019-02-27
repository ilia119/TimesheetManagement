package app.service;

import app.entities.Company;
import app.entities.Employee;
import app.entities.Project;

import java.util.List;

public interface CompanyService {

    void addEmployee(Company company, Employee employee);

    void addProject(Company company, Project project);

    List<Employee> getEmployees(Company company);

    List<Project> getProjects(Company company);

    List<Company> getCompanies();

    Company findById(int id);

    void save(Company company);

    void delete(Company company);
}
