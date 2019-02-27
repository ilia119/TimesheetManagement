package app.dao.factory.impl;

import app.dao.*;
import app.dao.factory.FactoryDao;
import org.springframework.beans.factory.annotation.Autowired;

public class FactoryDaoImpl implements FactoryDao {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private LogsDao logsDao;
    @Autowired
    private ProjectDao projectDao;

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
