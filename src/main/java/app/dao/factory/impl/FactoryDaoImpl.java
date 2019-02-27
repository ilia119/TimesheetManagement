package app.dao.factory.impl;

import app.dao.CompanyDao;
import app.dao.EmployeeDao;
import app.dao.LogsDao;
import app.dao.ProjectDao;
import app.dao.factory.impl.factory.FactoryDao;
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
