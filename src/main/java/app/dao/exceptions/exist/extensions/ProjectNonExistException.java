package app.dao.exceptions.exist.extensions;

import app.dao.exceptions.exist.NonExistException;
import app.entities.Project;

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
