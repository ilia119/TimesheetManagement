package app.server.config.beans;


import app.server.service.CompanyService;
import app.server.service.EmployeeService;
import app.server.service.LogsService;
import app.server.service.ProjectService;
import app.server.service.impl.CompanyServiceImpl;
import app.server.service.impl.EmployeeServiceImpl;
import app.server.service.impl.LogsServiceImpl;
import app.server.service.impl.ProjectServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

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

