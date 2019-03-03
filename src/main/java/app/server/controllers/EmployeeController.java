package app.server.controllers;

import app.server.entities.Employee;
import app.server.service.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/employee")
public class EmployeeController {

    @Autowired
    private FactoryService factoryService;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAll() {
        return factoryService.getEmployeeService().getEmployees();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee get(@PathParam("id") int id) {
        return factoryService.getEmployeeService().findById(id);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addEmployee(Employee employee) {
        factoryService.getEmployeeService()
                .save(new Employee(employee.getId(), employee.getName(),
                        employee.getPhoto(), employee.getEmail()));
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }

    @POST
    @Path("/delete/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteCompany(@PathParam("id") int id) {
        factoryService.getEmployeeService()
                .delete(id);
        return Response.status(Response.Status.OK.getStatusCode()).build();
    }

    @POST
    @Path("/assign/{employeeId}/{projectId}")
    public Response assignToProject(@PathParam("employeeId") int employeeId,
                                    @PathParam("projectId") int projectId) {
        factoryService.getEmployeeService()
                .assignToProject(factoryService.getEmployeeService()
                                .findById(employeeId),
                        factoryService.getProjectService().findById(projectId));
        return Response.status(Response.Status.OK.getStatusCode()).build();
    }
}
