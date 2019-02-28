package app.exceptions.extensions;

import app.exceptions.NotFoundException;

public class LogsNotFoundException extends NotFoundException {

    public LogsNotFoundException(String message, int id){
        super (message, id);
    }
}
