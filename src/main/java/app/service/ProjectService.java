package app.service;

import app.entities.Project;

import java.util.List;

public interface ProjectService {

    List<Project> getProjects();

    Project findById(int id);

    void save(Project project);

    void delete(Project project);
}
