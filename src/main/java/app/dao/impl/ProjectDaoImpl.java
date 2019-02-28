package app.dao.impl;

import app.dao.ProjectDao;
import app.entities.Project;
import app.exceptions.id.extensions.ProjectNotFoundByIdException;

import java.util.LinkedList;
import java.util.List;

public class ProjectDaoImpl implements ProjectDao {

    private static List<Project> projects = new LinkedList<>();

    static {

    }

    @Override
    public Project findById(int id) {
        for (Project project : projects) {
            try {
                if (project.getId() == id) {
                    return project;
                }
                throw new ProjectNotFoundByIdException("No project by id = " + id, id);
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
    public void delete(Project project) {
        projects.remove(project);
    }
}
