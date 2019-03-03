package app.controller;


import app.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Component
@Path("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GET
    @Path("/test")
    public String testRest() {
        return "test complete";
    }

    @GET
    @Path("all")
    public Response getAll() {
        String result
                = companyService.getCompanies().toString();

        return Response.status(200).entity(result).build();
    }
}
