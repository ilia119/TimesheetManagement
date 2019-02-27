package app.entities;

import java.util.LinkedList;
import java.util.List;

public class Company {

    private final int id;
    private final String name;
    private final String logoUrl;

    private List<Employee> employees = new LinkedList<>();
    private List<Project> projects = new LinkedList<>();

    public Company(int id, String name, String logoUrl) {
        this.id = id;
        this.name = name;
        this.logoUrl = logoUrl;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Project> getProjects() {
        return projects;
    }
}
