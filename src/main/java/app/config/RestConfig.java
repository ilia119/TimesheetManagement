package app.config;

import app.resources.CompanyResource;
import app.resources.EmployeeResource;
import app.resources.LogsResource;
import app.resources.ProjectResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/*")
public class RestConfig extends Application {

    public Set<Class<?>> getClasses() {
        return new
                HashSet<>(Arrays.asList(CompanyResource.class,
                EmployeeResource.class,
                ProjectResource.class,
                LogsResource.class));
    }
}
