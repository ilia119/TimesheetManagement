package app.dao.impl;

import app.dao.ProjectDao;
import app.dao.exceptions.exist.extensions.ProjectNonExistException;
import app.dao.exceptions.id.extensions.ProjectNotFoundByIdException;
import app.entities.Project;

import java.util.LinkedList;
import java.util.List;

public class ProjectDaoImpl implements ProjectDao {

    private static List<Project> projects = new LinkedList<>();

    @Override
    public List<Project> getAll() {
        return projects;
    }

    @Override
    public Project findById(int id) {
        for (Project project : projects) {
            try {
                if (project.getId() == id) {
                    return project;
                }
                throw new ProjectNotFoundByIdException("No project by id = "
                        + id, id);
            } catch (ProjectNotFoundByIdException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void save(Project project) {
        projects.add(project);
    }

    @Override
    public void delete(Project retiringProject) {
        try {
            for (Project project : projects) {
                if (project.equals(retiringProject)) {
                    projects.remove(retiringProject);
                    return;
                }
            }
            throw new ProjectNonExistException("Not exist this project: "
                    + retiringProject.toString(), retiringProject);
        } catch (ProjectNonExistException exception) {
            exception.printStackTrace();
        }
    }
}
