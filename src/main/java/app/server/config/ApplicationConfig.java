package app.server.config;

import app.server.resources.CompanyResource;
import app.server.resources.EmployeeResource;
import app.server.resources.LogsResource;
import app.server.resources.ProjectResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/*")
public class ApplicationConfig extends Application {
    public Set<Class<?>> getClasses() {
        return new
                HashSet<Class<?>>(Arrays.asList(CompanyResource.class,
                EmployeeResource.class,
                ProjectResource.class,
                LogsResource.class));
    }
}
