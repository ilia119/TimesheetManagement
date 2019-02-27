package app.service.impl;

import app.dao.ProjectDao;
import app.dao.factory.FactoryDao;
import app.entities.Project;
import app.service.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectDao projectDao =
            FactoryDao.getInstance().getProjectDao();

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
}
