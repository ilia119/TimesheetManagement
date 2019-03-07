package app.server.service;

import app.server.entities.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {

    List<Project> getProjects();

    Project findById(int id);

    void save(Project project);

    void delete(Project project);

    void delete(int id);

    void edit(Project project);
}
