package app;

import app.entities.Company;
import app.entities.Employee;
import app.entities.Project;
import app.service.factory.FactoryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    private static final int COMPANY_HORN_AND_HOOVES_ID = 0;

    private static final int PROJECT_CYBER_PINEAPPLE_ID = 0;
    private static final int PROJECT_PURPLE_WARM_AND_COLD_HAMMER_ID = 1;

    private static final int EMPLOYEE_MARINKA_MANDARINKA_ID = 0;
    private static final int EMPLOYEE_ALYNKA_APELSYNKA_ID = 1;
    private static final int EMPLOYEE_AGAP_KRYVOLAP_ID = 2;


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

        System.out.println('\n');

        Company company =
                factoryService.getCompanyService().findById(COMPANY_HORN_AND_HOOVES_ID);

        company.addEmployee(factoryService.getEmployeeService().findById(EMPLOYEE_MARINKA_MANDARINKA_ID));
        company.addEmployee(factoryService.getEmployeeService().findById(EMPLOYEE_ALYNKA_APELSYNKA_ID));
        company.addEmployee(factoryService.getEmployeeService().findById(EMPLOYEE_AGAP_KRYVOLAP_ID));

        company.addProject(factoryService.getProjectService().findById(PROJECT_CYBER_PINEAPPLE_ID));
        company.addProject(factoryService.getProjectService().findById(PROJECT_PURPLE_WARM_AND_COLD_HAMMER_ID));

        factoryService.getEmployeeService().assignToProject(
                factoryService.getEmployeeService().findById(EMPLOYEE_MARINKA_MANDARINKA_ID),
                factoryService.getProjectService().findById(PROJECT_CYBER_PINEAPPLE_ID)
        );
        factoryService.getEmployeeService().assignToProject(
                factoryService.getEmployeeService().findById(EMPLOYEE_AGAP_KRYVOLAP_ID),
                factoryService.getProjectService().findById(PROJECT_CYBER_PINEAPPLE_ID)
        );

        factoryService.getEmployeeService().assignToProject(
                factoryService.getEmployeeService().findById(EMPLOYEE_MARINKA_MANDARINKA_ID),
                factoryService.getProjectService().findById(PROJECT_PURPLE_WARM_AND_COLD_HAMMER_ID)
        );
        factoryService.getEmployeeService().assignToProject(
                factoryService.getEmployeeService().findById(EMPLOYEE_ALYNKA_APELSYNKA_ID),
                factoryService.getProjectService().findById(PROJECT_PURPLE_WARM_AND_COLD_HAMMER_ID)
        );
        factoryService.getEmployeeService().assignToProject(
                factoryService.getEmployeeService().findById(EMPLOYEE_AGAP_KRYVOLAP_ID),
                factoryService.getProjectService().findById(PROJECT_PURPLE_WARM_AND_COLD_HAMMER_ID)
        );

        System.out.println(company.toString());

    }
}
