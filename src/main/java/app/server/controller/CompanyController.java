package app.server.controller;


import app.server.service.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
    public String getAll() {
        String result = "fail";
        result = factoryService.getCompanyService().getCompanies().toString();
        return result;
    }

}
