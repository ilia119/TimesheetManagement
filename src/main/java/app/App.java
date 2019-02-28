package app;

import app.entities.Company;
import app.entities.Employee;
import app.entities.Project;
import app.service.factory.FactoryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {


        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("app/config");

        FactoryService factoryService =
                applicationContext.getBean(FactoryService.class);

        for (Company company :
                factoryService.getCompanyService().getCompanies()) {
            System.out.println(company.toString());
        }

        for (Project project :
        factoryService.getProjectService().getProjects()) {
            System.out.println(project.toString());
        }

        for (Employee employee :
        factoryService.getEmployeeService().getEmployees()) {
            System.out.println(employee.toString());
        }
    }
}
