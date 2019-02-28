package app.dao.exceptions.id.extensions;

import app.dao.exceptions.id.NotFoundByIdException;

public class CompanyNotFoundByIdException extends NotFoundByIdException {

    public CompanyNotFoundByIdException(String message, int id){
        super (message, id);
    }
}
