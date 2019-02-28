package app.entities;

import java.util.Date;
import java.util.Objects;

public class Project {

    private final int id;
    private final String name;
    private final String logoUrl;
    private final Date startDate;
    private final Date endDate;
    private final long manHours;

    public Project(int id, String name, String logoUrl,
                   Date startDate, Date endDate, long manHours) {
        this.id = id;
        this.name = name;
        this.logoUrl = logoUrl;
        this.startDate = startDate;
        this.endDate = endDate;
        this.manHours = manHours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getManHours() {
        return manHours;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Project)) {
            return false;
        }
        Project project = (Project) object;
        return id == project.id
                && Double.compare(project.manHours, manHours) == 0
                && Objects.equals(name, project.name)
                && Objects.equals(logoUrl, project.logoUrl)
                && Objects.equals(startDate, project.startDate)
                && Objects.equals(endDate, project.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, logoUrl, startDate, endDate, manHours);
    }

    @Override
    public String toString() {
        return "Project{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", logoUrl='" + logoUrl + '\''
                + ", startDate=" + startDate
                + ", endDate=" + endDate
                + ", manHours=" + manHours
                + '}';
    }
}
