package app.exceptions.id.extensions;

import app.exceptions.id.NotFoundByIdException;

public class ProjectNotFoundByIdException extends NotFoundByIdException {

    public ProjectNotFoundByIdException(String message, int id){
        super (message, id);
    }
}
