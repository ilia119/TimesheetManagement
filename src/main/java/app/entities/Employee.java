package app.entities;

public class Employee {

    private final int id;
    private final String name;
    private final String photo;
    private final String email;

    public Employee(int id, String name, String photo, String email) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.email = email;
    }
}
