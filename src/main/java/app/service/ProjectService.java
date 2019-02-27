package app.service;

import app.entities.Project;

public interface ProjectService {

    Project findById(int id);

    void save(Project project);

    void delete(Project project);
}
