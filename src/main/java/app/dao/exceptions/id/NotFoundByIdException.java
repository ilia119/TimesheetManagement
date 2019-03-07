package app.dao.exceptions.id;

public class NotFoundByIdException extends Exception {

    private int id;

    public int getId() {
        return id;
    }

    public NotFoundByIdException(String message, int id) {
        super(message);
        this.id = id;
    }
}
