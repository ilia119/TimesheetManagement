package app.entities;

import java.util.Date;

public class Project {

    private final int id;
    private final String name;
    private final String logoUrl;
    private final Date startDate;
    private final Date endDate;
    private final double manHours;

    public Project(int id, String name, String logoUrl, Date startDate, Date endDate, double manHours) {
        this.id = id;
        this.name = name;
        this.logoUrl = logoUrl;
        this.startDate = startDate;
        this.endDate = endDate;
        this.manHours = manHours;
    }
}
