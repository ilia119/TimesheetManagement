package app.exceptions.id.extensions;

import app.exceptions.id.NotFoundByIdException;

public class EmployeeNotFoundByIdException extends NotFoundByIdException {

    public EmployeeNotFoundByIdException(String message, int id){
        super (message, id);
    }
}
