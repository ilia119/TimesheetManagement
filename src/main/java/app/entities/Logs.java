package app.entities;

import java.util.Date;

public class Logs {

    private final Employee employee;
    private final Project project;
    private final int time;
    private final String comment;
    private final Date date;

    public Logs(Employee employee, Project project, int time, String comment, Date date) {
        this.employee = employee;
        this.project = project;
        this.time = time;
        this.comment = comment;
        this.date = date;
    }

}
