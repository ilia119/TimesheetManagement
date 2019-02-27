package app.service;

import app.entities.Project;

public interface ProjectService {

    EmployeeService getEmployeeService();

    void addProject(Project project);
}
