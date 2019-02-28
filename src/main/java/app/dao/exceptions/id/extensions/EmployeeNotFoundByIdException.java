package app.dao.exceptions.id.extensions;

import app.dao.exceptions.id.NotFoundByIdException;

public class EmployeeNotFoundByIdException extends NotFoundByIdException {

    public EmployeeNotFoundByIdException(String message, int id){
        super (message, id);
    }
}
