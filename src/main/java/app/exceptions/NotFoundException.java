package app.exceptions;

public class NotFoundException extends Exception {

    private int id;

    public int getId() {
        return id;
    }

    public NotFoundException(String message, int id){
        super (message);
        this.id = id;
    }
}
