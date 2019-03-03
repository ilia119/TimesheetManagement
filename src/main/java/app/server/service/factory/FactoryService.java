package app.server.service.factory;

import app.server.service.CompanyService;
import app.server.service.EmployeeService;
import app.server.service.LogsService;
import app.server.service.ProjectService;

public interface FactoryService {

    CompanyService getCompanyService();

    EmployeeService getEmployeeService();

    LogsService getLogsService();

    ProjectService getProjectService();
}
