package app.server.controllers;


import app.server.entities.Company;
import app.server.service.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Path("/company")
public class CompanyController {

    @Autowired
    FactoryService factoryService;


    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Company testRest() {
        Company company = new Company();

        return company;
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Company> getAll() {
        return factoryService.getCompanyService().getCompanies();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJson(Company company) {
        factoryService.getCompanyService().save(company);
        return Response.status(Response.Status.OK.getStatusCode()).build();
    }

    /*
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public String addCompany(Company company) {

        factoryService.getCompanyService()
                .save(new Company(company.getId(), company.getName(),
                        company.getLogoUrl()));

        return "" + company.getId();
    }
*/
/*
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response addCompany(Company company, @Context UriInfo uriInfo) {
        factoryService.getCompanyService()
                .save(new Company(company.getId(), company.getName(),
                        company.getLogoUrl()));
        return Response.status(Response.Status.CREATED.getStatusCode())
                .header("Location", String.format("%s%s", uriInfo
                        .getAbsolutePath().toString(), company.getId())).build();
    }
    */


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCompany(Company company) {

        factoryService.getCompanyService()
                .save(new Company(company.getId(), company.getName(),
                        company.getLogoUrl()));

        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }





}
