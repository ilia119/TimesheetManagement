package app.exceptions.handlers;

import app.exceptions.EntityNotFound;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionHandler
        implements ExceptionMapper<EntityNotFound> {

    @Override
    public Response toResponse(EntityNotFound exception) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
