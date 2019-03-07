package app.server.resources;

import app.server.entities.Project;
import app.server.service.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/project")
public class ProjectResource {

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
    public Response add(Project project) {
        factoryService.getProjectService()
                .save(project);
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }

    @PUT
    @Path("/edit/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id") int id, Project project) {
        factoryService.getProjectService()
                .edit(project);
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }

    @DELETE
    @Path("/delete/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") int id) {
        factoryService.getProjectService()
                .delete(id);
        return Response.status(Response.Status.OK.getStatusCode()).build();
    }
}
