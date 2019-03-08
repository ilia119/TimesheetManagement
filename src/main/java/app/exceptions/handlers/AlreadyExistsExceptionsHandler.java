package app.exceptions.handlers;

import app.exceptions.EntityAlreadyExists;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class AlreadyExistsExceptionsHandler
        implements ExceptionMapper<EntityAlreadyExists> {

    @Override
    public Response toResponse(EntityAlreadyExists exception) {
        return Response.status(Response.Status.CONFLICT.getStatusCode()).build();
    }
}
