package app.service;

public interface FactoryService {

    CompanyService getCompanyService();

    EmployeeService getEmployeeService();

    LogsService getLogsService();

    ProjectService getProjectService();
}
