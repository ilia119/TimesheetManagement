package app.server.config;

import app.server.controllers.CompanyController;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

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
                MOXyJsonProvider.class));
    }
}
