package app.service.impl;

import app.entities.Project;
import app.service.EmployeeService;
import app.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    @Override
    public void addProject(Project project) {

    }
}
