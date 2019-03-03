package app.server.dao.exceptions.id.extensions;

import app.server.dao.exceptions.id.NotFoundByIdException;

public class EmployeeNotFoundByIdException extends NotFoundByIdException {

    public EmployeeNotFoundByIdException(String message, int id) {
        super(message, id);
    }
}
