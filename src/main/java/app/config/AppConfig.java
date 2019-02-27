package app.config;


import app.dao.CompanyDao;
import app.dao.EmployeeDao;
import app.dao.LogsDao;
import app.dao.ProjectDao;
import app.dao.factory.impl.FactoryDaoImpl;
import app.dao.factory.FactoryDao;
import app.dao.impl.CompanyDaoImpl;
import app.dao.impl.EmployeeDaoImpl;
import app.dao.impl.LogsDaoImpl;
import app.dao.impl.ProjectDaoImpl;
import app.service.*;
import app.service.factory.FactoryService;
import app.service.factory.impl.FactoryServiceImpl;
import app.service.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FactoryService getFabricService() {
        return new FactoryServiceImpl();
    }

    @Bean
    public CompanyService getCompanyService() {
        return new CompanyServiceImpl();
    }

    @Bean
    public EmployeeService getEmployeeService() {
        return new EmployeeServiceImpl();
    }

    @Bean
    public LogsService getLogsService() {
        return new LogsServiceImpl();
    }

    @Bean
    public ProjectService getProjectService() {
        return new ProjectServiceImpl();
    }

    @Bean
    public FactoryDao getFactoryDao() {
        return new FactoryDaoImpl();
    }

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

