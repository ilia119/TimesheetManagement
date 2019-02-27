package app.dao.impl;

import app.dao.ProjectDao;
import app.entities.Project;

import java.util.LinkedList;
import java.util.List;

public class ProjectDaoImpl implements ProjectDao {

    private static List<Project> projects = new LinkedList<>();

    static {

    }

    @Override
    public Project findById(int id) {
        return projects.get(id);
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
