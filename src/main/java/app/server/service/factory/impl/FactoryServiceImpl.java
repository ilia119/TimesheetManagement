package app.server.service.factory.impl;

import app.server.service.CompanyService;
import app.server.service.EmployeeService;
import app.server.service.LogsService;
import app.server.service.ProjectService;
import app.server.service.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactoryServiceImpl implements FactoryService {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private LogsService logsService;

    @Autowired
    private ProjectService projectService;

    @Override
    public CompanyService getCompanyService() {
        return companyService;
    }

    @Override
    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    @Override
    public LogsService getLogsService() {
        return logsService;
    }

    @Override
    public ProjectService getProjectService() {
        return projectService;
    }
}
