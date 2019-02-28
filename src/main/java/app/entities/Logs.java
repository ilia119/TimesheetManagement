package app.entities;

import java.util.Date;
import java.util.Objects;

public class Logs {

    private final Employee employee;
    private final Project project;
    private final long time;
    private final String comment;
    private final Date date;

    public Logs(Employee employee, Project project, long time,
                String comment, Date date) {
        this.employee = employee;
        this.project = project;
        this.time = time;
        this.comment = comment;
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }

    public double getTime() {
        return time;
    }

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Logs)) {
            return false;
        }
        Logs logs = (Logs) object;
        return Double.compare(logs.time, time) == 0
                && Objects.equals(employee, logs.employee)
                && Objects.equals(project, logs.project)
                && Objects.equals(comment, logs.comment)
                && Objects.equals(date, logs.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, project, time, comment, date);
    }

    @Override
    public String toString() {
        return "Log{"
                + " Employee: " + employee.getName() + ';'
                + " Project: " + project.getName() + ';'
                + " Time: " + time + ';'
                + " Date: " + date + ';'
                + '\n'
                + "comment: '" + comment + '\''
                + '}';
    }
}
