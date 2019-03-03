package app.server.controllers;


import app.server.entities.Company;
import app.server.service.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/company")
public class CompanyController {

    @Autowired
    FactoryService factoryService;


    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public String testRest() {
        return "test complete";
    }


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Company> getAll() {
        return factoryService.getCompanyService().getCompanies();
    }

}
