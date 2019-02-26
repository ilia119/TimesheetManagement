package app.service.impl;

import app.service.*;
import org.springframework.beans.factory.annotation.Autowired;

public class FabricServiceImpl implements FabricService {

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
