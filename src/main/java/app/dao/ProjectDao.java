package app.dao;

import app.entities.Project;

public interface ProjectDao {

    Project findById(int id);

    void save(Project project);

    void delete(Project project);

}
