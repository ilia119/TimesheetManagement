package app.dao;

import app.entities.Project;

import java.util.List;

public interface ProjectDao {

    List<Project> getAll();

    Project findById(int id);

    void save(Project project);

    void delete(Project project);

}
