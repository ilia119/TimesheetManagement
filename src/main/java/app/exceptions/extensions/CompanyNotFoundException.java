package app.exceptions.extensions;

import app.exceptions.NotFoundException;

public class CompanyNotFoundException extends NotFoundException {

    public CompanyNotFoundException(String message, int id){
        super (message, id);
    }
}
