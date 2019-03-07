package app.server.resources;


import app.server.entities.Logs;
import app.server.entities.namespace.LogsNamespace;
import app.server.service.factory.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/logs")
public class LogsResource {

    @Autowired
    private FactoryService factoryService;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Logs> getAll() {
        return factoryService.getLogsService().getAllLogs();
    }

    @GET
    @Path("/get/today")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Logs> getForToday() {
        return factoryService.getLogsService()
                .getLogFor(LogsNamespace.TODAY);
    }

    @GET
    @Path("/get/week")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Logs> getForThisWeek() {
        return factoryService.getLogsService()
                .getLogFor(LogsNamespace.THIS_WEEK);
    }

    @GET
    @Path("/get/month")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Logs> getForThisMonth() {
        return factoryService.getLogsService()
                .getLogFor(LogsNamespace.THIS_MONTH);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Logs logs) {
        factoryService.getLogsService()
                .save(logs);
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }

    @DELETE
    @Path("/delete")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(Logs logs) {
        factoryService.getLogsService().delete(logs);
        return Response.status(Response.Status.OK.getStatusCode()).build();
    }
}
