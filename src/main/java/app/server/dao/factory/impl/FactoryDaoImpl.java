package app.server.dao.factory.impl;

import app.server.dao.CompanyDao;
import app.server.dao.EmployeeDao;
import app.server.dao.LogsDao;
import app.server.dao.ProjectDao;
import app.server.dao.factory.FactoryDao;
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
