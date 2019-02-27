package app;

import app.config.AppConfig;
import app.entities.Company;
import app.service.factory.FactoryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        FactoryService factoryService =
                applicationContext.getBean(FactoryService.class);

        List<Company> companies = new LinkedList<>();
        companies = factoryService.getCompanyService().getCompanies();

        for (Company company : companies) {
            System.out.println(company.toString());
        }

    }
}
