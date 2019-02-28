package app.exceptions;

public class ProjectNotFoundException extends Exception{

    private int id;

    public int getId() {
        return id;
    }

    public ProjectNotFoundException(String message, int id){
        super (message);
        this.id = id;
    }
}
