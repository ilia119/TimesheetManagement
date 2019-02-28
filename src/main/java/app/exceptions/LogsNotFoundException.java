package app.exceptions;

public class LogsNotFoundException extends Exception{

    private int id;

    public int getId() {
        return id;
    }

    public LogsNotFoundException(String message, int id){
        super (message);
        this.id = id;
    }
}
