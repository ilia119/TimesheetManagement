package app.server.dao.exceptions.exist.extensions;

import app.server.dao.exceptions.exist.NonExistException;
import app.server.entities.Project;

public class ProjectNonExistException extends NonExistException {

    private Project project;

    public Project getProject() {
        return project;
    }

    public ProjectNonExistException(String message, Project project) {
        super(message);
        this.project = project;
    }
}
