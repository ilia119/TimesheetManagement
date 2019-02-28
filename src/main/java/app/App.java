package app;

import app.entities.Company;
import app.service.factory.FactoryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("app/config");

        FactoryService factoryService =
                applicationContext.getBean(FactoryService.class);

        List<Company> companies = factoryService.getCompanyService().getCompanies();

        for (Company company : companies) {
            System.out.println(company.toString());
        }

        Company company = factoryService.getCompanyService().findById(56);
        System.out.println(company.toString());

    }
}
