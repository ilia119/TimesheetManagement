package app.service;

public interface FabricService {

    CompanyService getCompanyService();

    EmployeeService getEmployeeService();

    LogsService getLogsService();

    ProjectService getProjectService();
}
