package app.service.factory;

import app.service.CompanyService;
import app.service.EmployeeService;
import app.service.LogsService;
import app.service.ProjectService;

public interface FactoryService {

    CompanyService getCompanyService();

    EmployeeService getEmployeeService();

    LogsService getLogsService();

    ProjectService getProjectService();
}
