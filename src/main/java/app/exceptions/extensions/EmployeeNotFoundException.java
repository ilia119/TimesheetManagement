package app.exceptions.extensions;

import app.exceptions.NotFoundException;

public class EmployeeNotFoundException extends NotFoundException {

    public EmployeeNotFoundException(String message, int id){
        super (message, id);
    }
}
