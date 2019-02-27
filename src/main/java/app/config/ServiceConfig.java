package app.config;


import app.service.CompanyService;
import app.service.EmployeeService;
import app.service.LogsService;
import app.service.ProjectService;
import app.service.factory.FactoryService;
import app.service.factory.impl.FactoryServiceImpl;
import app.service.impl.CompanyServiceImpl;
import app.service.impl.EmployeeServiceImpl;
import app.service.impl.LogsServiceImpl;
import app.service.impl.ProjectServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

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

}

