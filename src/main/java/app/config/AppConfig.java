package app.config;


import app.service.EmployeeService;
import app.service.impl.EmployeeServiceImpl;
import app.service.impl.ProjectServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProjectServiceImpl getProjectService() {
        return new ProjectServiceImpl();
    }

    @Bean
    public EmployeeService getEmployeeService() {
        return new EmployeeServiceImpl();
    }
}
