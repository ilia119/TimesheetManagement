package app.entities;

import app.utils.TimeUtil;

import java.util.Date;
import java.util.Objects;

public class Project {

    private int id;
    private String name;
    private String logoUrl;
    private Date startDate;
    private Date endDate;
    private long manHours;

    public Project() {
    }

    public Project(int id, String name, String logoUrl,
                   Date startDate, Date endDate, long manHoursInMilliseconds) {
        this.id = id;
        this.name = name;
        this.logoUrl = logoUrl;
        this.startDate = startDate;
        this.endDate = endDate;
        this.manHours = manHoursInMilliseconds;
    }

    public Project(int id, String name, String logoUrl,
                   Date startDate, Date endDate, int manHoursInHours) {
        this(id, name, logoUrl, startDate, endDate,
                TimeUtil.hoursToMillisecond(manHoursInHours));
    }

    public Project(Project project) {
        this(project.getId(), project.getName(), project.getLogoUrl(),
                project.getStartDate(), project.getEndDate(), project.getManHours());
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

    public long getManHours() {
        return manHours;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setManHours(long manHoursInMilliseconds) {
        this.manHours = manHoursInMilliseconds;
    }

    public void setManHours(int manHoursInHours) {
        this.manHours = TimeUtil.hoursToMillisecond(manHoursInHours);
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
