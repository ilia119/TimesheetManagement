package app.server.controllers;


import app.server.entities.Company;
import app.server.service.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/company")
public class CompanyController {

    @Autowired
    private FactoryService factoryService;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Company> getAll() {
        return factoryService.getCompanyService().getCompanies();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Company get(@PathParam("id") int id) {
        return factoryService.getCompanyService().findById(id);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCompany(Company company) {
        factoryService.getCompanyService()
                .save(company);
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }

    @POST
    @Path("/delete/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteCompany(@PathParam("id") int id) {
        factoryService.getCompanyService()
                .delete(id);
        return Response.status(Response.Status.OK.getStatusCode()).build();
    }

    @POST
    @Path("/add/employee/{companyId}/{employeeId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addEmployeeToCompany(@PathParam("companyId") int companyId,
                                         @PathParam("employeeId") int employeeId) {
        factoryService.getCompanyService()
                .addEmployee(factoryService.getCompanyService()
                                .findById(companyId),
                        factoryService.getEmployeeService()
                                .findById(employeeId));
        return Response.status(Response.Status.OK.getStatusCode()).build();
    }

    @POST
    @Path("/add/project/{companyId}/{projectId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addProjectToCompany(@PathParam("companyId") int companyId,
                                        @PathParam("projectId") int projectId) {
        factoryService.getCompanyService()
                .addProject(factoryService.getCompanyService()
                                .findById(companyId),
                        factoryService.getProjectService()
                                .findById(projectId));
        return Response.status(Response.Status.OK.getStatusCode()).build();
    }
}
