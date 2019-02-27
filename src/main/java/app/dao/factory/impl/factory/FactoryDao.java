package app.dao.factory.impl.factory;

import app.dao.CompanyDao;
import app.dao.EmployeeDao;
import app.dao.LogsDao;
import app.dao.ProjectDao;

public interface FactoryDao {

    CompanyDao getCompanyDao();

    EmployeeDao getEmployeeDao();

    LogsDao getLogsDao();

    ProjectDao getProjectDao();
}
