package app.entities;

public class Company {

    private final int id;
    private final String name;
    private final String logoUrl;

    public Company(int id, String name, String logoUrl) {
        this.id = id;
        this.name = name;
        this.logoUrl = logoUrl;
    }
}
