package app.entities;

import java.io.IOException;
import java.util.Properties;

public class ProjectVersion {
    private String version;

    public ProjectVersion(String version) {
        this.version = version;
    }

    public ProjectVersion() {

    }

    public ProjectVersion getProjectVersion() {
        return new ProjectVersion(getVersion());
    }

    public String getVersion() {
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/project.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return version = properties.getProperty("version");
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ProjectVersion{" +
                "version='" + version + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectVersion that = (ProjectVersion) o;

        return version != null ? version.equals(that.version) : that.version == null;
    }

    @Override
    public int hashCode() {
        return version != null ? version.hashCode() : 0;
    }
}
