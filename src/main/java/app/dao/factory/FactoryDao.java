package app.dao.factory;

import app.dao.*;
import app.dao.impl.CompanyDaoImpl;
import app.dao.impl.EmployeeDaoImpl;
import app.dao.impl.LogsDaoImpl;
import app.dao.impl.ProjectDaoImpl;

public class FactoryDao {

    private static FactoryDao ourInstance = new FactoryDao();

    public static FactoryDao getInstance() {
        return ourInstance;
    }

    private CompanyDao companyDao = new CompanyDaoImpl();
    private EmployeeDao employeeDao = new EmployeeDaoImpl();
    private LogsDao logsDao = new LogsDaoImpl();
    private ProjectDao projectDao = new ProjectDaoImpl();

    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public LogsDao getLogsDao() {
        return logsDao;
    }

    public ProjectDao getProjectDao() {
        return projectDao;
    }
}
