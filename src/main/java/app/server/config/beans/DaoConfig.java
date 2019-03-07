package app.server.config.beans;


import app.server.dao.CompanyDao;
import app.server.dao.EmployeeDao;
import app.server.dao.LogsDao;
import app.server.dao.ProjectDao;
import app.server.dao.impl.CompanyDaoImpl;
import app.server.dao.impl.EmployeeDaoImpl;
import app.server.dao.impl.LogsDaoImpl;
import app.server.dao.impl.ProjectDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {

    @Bean
    public CompanyDao getCompanyDao() {
        return new CompanyDaoImpl();
    }

    @Bean
    public EmployeeDao getEmployeeDao() {
        return new EmployeeDaoImpl();
    }

    @Bean
    public LogsDao getLogsDao() {
        return new LogsDaoImpl();
    }

    @Bean
    public ProjectDao getProjectDao() {
        return new ProjectDaoImpl();
    }
}
