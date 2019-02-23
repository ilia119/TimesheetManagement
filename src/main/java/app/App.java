package app;

import app.beans.Employee;
import app.config.AppConfig;
import app.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService =
                applicationContext.getBean(EmployeeService.class);

        List<Employee> employees = employeeService.getEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " "
                    + employee.getLastName());
        }
    }
}
