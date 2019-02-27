package app.dao.impl;

import app.dao.*;

public class FactoryDaoImpl implements FactoryDao {

    private static FactoryDaoImpl ourInstance = new FactoryDaoImpl();

    public static FactoryDaoImpl getInstance() {
        return ourInstance;
    }

    private CompanyDao companyDao = new CompanyDaoImpl();
    private EmployeeDao employeeDao = new EmployeeDaoImpl();
    private LogsDao logsDao = new LogsDaoImpl();
    private ProjectDao projectDao = new ProjectDaoImpl();

    @Override
    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    @Override
    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    @Override
    public LogsDao getLogsDao() {
        return logsDao;
    }

    @Override
    public ProjectDao getProjectDao() {
        return projectDao;
    }
}
