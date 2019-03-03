package app.server.config;

import app.server.controllers.CompanyController;
import app.server.controllers.EmployeeController;
import app.server.controllers.ProjectController;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/resource")
public class RestConfig extends Application {
    public Set<Class<?>> getClasses() {
        return new
                HashSet<Class<?>>(Arrays.asList(CompanyController.class,
                EmployeeController.class,
                ProjectController.class));
    }
}
