package app.exceptions.id.extensions;

import app.exceptions.id.NotFoundByIdException;

public class CompanyNotFoundByIdException extends NotFoundByIdException {

    public CompanyNotFoundByIdException(String message, int id){
        super (message, id);
    }
}
