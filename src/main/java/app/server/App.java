package app.server;

import app.server.service.factory.FactoryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("app/server/config");

        FactoryService factoryService
                = applicationContext.getBean(FactoryService.class);

        System.out.println(factoryService.getCompanyService().getCompanies().toString());
    }
}
