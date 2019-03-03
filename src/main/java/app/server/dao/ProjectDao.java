package app.server.dao;

import app.server.entities.Project;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDao {

    List<Project> getAll();

    Project findById(int id);

    void save(Project project);

    void delete(Project project);

}
