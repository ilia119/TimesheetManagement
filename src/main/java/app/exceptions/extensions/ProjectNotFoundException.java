package app.exceptions.extensions;

import app.exceptions.NotFoundException;

public class ProjectNotFoundException extends NotFoundException {

    public ProjectNotFoundException(String message, int id){
        super (message, id);
    }
}
