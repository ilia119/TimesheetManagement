package app.dao;

public interface FactoryDao {

    CompanyDao getCompanyDao();

    EmployeeDao getEmployeeDao();

    LogsDao getLogsDao();

    ProjectDao getProjectDao();
}
