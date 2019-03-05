package app.server.controllers;

import app.server.entities.Project;
import app.server.service.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/project")
public class ProjectController {

    @Autowired
    private FactoryService factoryService;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Project> getAll() {
        return factoryService.getProjectService().getProjects();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Project get(@PathParam("id") int id) {
        return factoryService.getProjectService().findById(id);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addProject(Project project) {
        factoryService.getProjectService()
                .save(project);
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }

    @POST
    @Path("/delete/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteProject(@PathParam("id") int id) {
        factoryService.getProjectService()
                .delete(id);
        return Response.status(Response.Status.OK.getStatusCode()).build();
    }
}
