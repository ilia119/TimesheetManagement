package app.server.dao.exceptions.id.extensions;

import app.server.dao.exceptions.id.NotFoundByIdException;

public class ProjectNotFoundByIdException extends NotFoundByIdException {

    public ProjectNotFoundByIdException(String message, int id) {
        super(message, id);
    }
}
