package app.server.resources;

import app.server.entities.Employee;
import app.server.service.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/employee")
public class EmployeeResource {

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
    public Response add(Employee employee) {
        factoryService.getEmployeeService()
                .save(employee);
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }

    @PUT
    @Path("/edit/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id") int id, Employee employee) {
        factoryService.getEmployeeService()
                .edit(employee);
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }

    @DELETE
    @Path("/delete/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") int id) {
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
