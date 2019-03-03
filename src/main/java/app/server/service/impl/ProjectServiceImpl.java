package app.server.service.impl;

import app.server.dao.ProjectDao;
import app.server.entities.Project;
import app.server.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;

    @Override
    public List<Project> getProjects() {
        return projectDao.getAll();
    }

    @Override
    public Project findById(int id) {
        return projectDao.findById(id);
    }

    @Override
    public void save(Project project) {
        projectDao.save(project);
    }

    @Override
    public void delete(Project project) {
        projectDao.delete(project);
    }

    @Override
    public void delete(int id) {
        projectDao.delete(projectDao.findById(id));
    }
}
