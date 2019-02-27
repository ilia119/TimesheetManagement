package app.entities;

import java.util.Date;

public class Logs {

    private final Employee employee;
    private final Project project;
    private final double time;
    private final String comment;
    private final Date date;

    public Logs(Employee employee, Project project, double time, String comment, Date date) {
        this.employee = employee;
        this.project = project;
        this.time = time;
        this.comment = comment;
        this.date = date;
    }

}
