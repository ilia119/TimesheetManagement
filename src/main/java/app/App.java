package app;

import app.entities.Employee;
import app.config.AppConfig;
import app.service.ProjectService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        ProjectService projectService =
                applicationContext.getBean(ProjectService.class);

        List<Employee> employees =
                projectService.getEmployeeService().getAll();
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " "
                    + employee.getLastName());
        }
    }
}
