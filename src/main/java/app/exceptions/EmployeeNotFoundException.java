package app.exceptions;

public class EmployeeNotFoundException extends Exception {

    private int id;

    public int getId() {
        return id;
    }

    public EmployeeNotFoundException(String message, int id){
        super (message);
        this.id = id;
    }
}
