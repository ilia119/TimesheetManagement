package app.config;


import app.service.EmployeeService;
import app.service.ProjectService;
import app.service.impl.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProjectService getProjectService() {
        return new ProjectService();
    }

    @Bean
    public EmployeeService getEmployeeService() {
        return new EmployeeServiceImpl();
    }
}
