package app.server.dao.factory;

import app.server.dao.CompanyDao;
import app.server.dao.EmployeeDao;
import app.server.dao.LogsDao;
import app.server.dao.ProjectDao;

public interface FactoryDao {

    CompanyDao getCompanyDao();

    EmployeeDao getEmployeeDao();

    LogsDao getLogsDao();

    ProjectDao getProjectDao();
}
