package app;

import app.entities.Company;
import app.entities.Employee;
import app.entities.Logs;
import app.entities.Project;
import app.service.factory.FactoryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;
import java.util.Date;

public class App {

    private static final int COMPANY_HORN_AND_HOOVES_ID = 0;

    private static final int PROJECT_CYBER_PINEAPPLE_ID = 0;
    private static final int PROJECT_PURPLE_WARM_AND_COLD_HAMMER_ID = 1;

    private static final int EMPLOYEE_MARINKA_MANDARINKA_ID = 0;
    private static final int EMPLOYEE_ALYNKA_APELSYNKA_ID = 1;
    private static final int EMPLOYEE_AGAP_KRYVOLAP_ID = 2;

    private static ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext("app/config");

    private static FactoryService factoryService =
            applicationContext.getBean(FactoryService.class);

    static {
        addEmployeesToCompany();
        addProjectsToCompany();
        assignEmployeesToProjects();

        fillLogs();
    }


    public static void main(String[] args) {

        for (Logs logs :
                factoryService.getLogsService().getAllLogs()) {
            System.out.println(logs.toString());
        }

    }

    private static void fillLogs() {
        Employee employeeMarinka =
                factoryService.getEmployeeService().findById(EMPLOYEE_MARINKA_MANDARINKA_ID);
        Employee employeeAlynka =
                factoryService.getEmployeeService().findById(EMPLOYEE_ALYNKA_APELSYNKA_ID);
        Employee employeeAgap =
                factoryService.getEmployeeService().findById(EMPLOYEE_AGAP_KRYVOLAP_ID);

        Project projectPineapple =
                factoryService.getProjectService().findById(PROJECT_CYBER_PINEAPPLE_ID);
        Project projectHammer =
                factoryService.getProjectService().findById(PROJECT_PURPLE_WARM_AND_COLD_HAMMER_ID);

        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        calendar.set(Calendar.HOUR, 9);
        calendar.set(Calendar.MINUTE, 13);
        calendar.set(Calendar.SECOND, 13);

        Logs logs = new Logs(employeeMarinka, projectPineapple, 3600000L,
                "Wow ... such interesting project...",
                new Date(calendar.getTimeInMillis())
        );
        factoryService.getLogsService().save(logs);

        calendar.set(Calendar.DAY_OF_MONTH, 9);
        logs = new Logs(employeeAlynka, projectHammer, 21600000L,
                "I have always dreamed of such a project!!!",
                new Date(calendar.getTimeInMillis())
        );
        factoryService.getLogsService().save(logs);

        calendar.set(Calendar.DAY_OF_MONTH, 15);
        logs = new Logs(employeeAgap, projectPineapple, 108000000L,
                "Marinka is so stupid...",
                new Date(calendar.getTimeInMillis())
        );
        factoryService.getLogsService().save(logs);

        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 6);
        logs = new Logs(employeeAgap, projectHammer, 288000000L,
                "I hate these people...",
                new Date(calendar.getTimeInMillis())
        );
        factoryService.getLogsService().save(logs);

        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        logs = new Logs(employeeMarinka, projectHammer, 324000000L,
                "I love this project so much!!!",
                new Date(calendar.getTimeInMillis())
        );
        factoryService.getLogsService().save(logs);

        calendar.set(Calendar.DAY_OF_MONTH, 25);
        logs = new Logs(employeeAgap, projectPineapple, 414000000L,
                "So ... we blew up our cyber pineapple...",
                new Date(calendar.getTimeInMillis())
        );
        factoryService.getLogsService().save(logs);

        calendar.set(Calendar.DAY_OF_MONTH, 26);
        logs = new Logs(employeeMarinka, projectPineapple, 468000000L,
                "We blew up our cyber pineapple. This is so funny!!!",
                new Date(calendar.getTimeInMillis()));
        factoryService.getLogsService().save(logs);

        calendar.set(Calendar.DAY_OF_MONTH, 28);
        logs = new Logs(employeeAlynka, projectHammer, 648000000L,
                "This project is so amazing! But Agap already got me. " +
                        "I plan to use purple warm&cold hammer against Agap.",
                new Date(calendar.getTimeInMillis()));
        factoryService.getLogsService().save(logs);
    }

    private static void assignEmployeesToProjects() {
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
    }

    private static void outputCompanyToString() {
        Company company =
                factoryService.getCompanyService().findById(COMPANY_HORN_AND_HOOVES_ID);

        System.out.println(company.toString());
    }

    private static void addEmployeesToCompany() {
        Company company =
                factoryService.getCompanyService().findById(COMPANY_HORN_AND_HOOVES_ID);

        company.addEmployee(factoryService.getEmployeeService().findById(EMPLOYEE_MARINKA_MANDARINKA_ID));
        company.addEmployee(factoryService.getEmployeeService().findById(EMPLOYEE_ALYNKA_APELSYNKA_ID));
        company.addEmployee(factoryService.getEmployeeService().findById(EMPLOYEE_AGAP_KRYVOLAP_ID));
    }

    private static void addProjectsToCompany() {
        Company company =
                factoryService.getCompanyService().findById(COMPANY_HORN_AND_HOOVES_ID);

        company.addProject(factoryService.getProjectService().findById(PROJECT_CYBER_PINEAPPLE_ID));
        company.addProject(factoryService.getProjectService().findById(PROJECT_PURPLE_WARM_AND_COLD_HAMMER_ID));
    }

    private static void outputAllData() {

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

        for (Logs logs :
                factoryService.getLogsService().getAllLogs()) {
            System.out.println(logs.toString());
        }

        System.out.println('\n');
    }
}
