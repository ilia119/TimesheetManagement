package app.exceptions;

public class CompanyNotFoundException extends Exception{

    private int id;

    public int getId() {
        return id;
    }

    public CompanyNotFoundException(String message, int id){
        super (message);
        this.id = id;
    }
}
