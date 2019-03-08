package app.dao.impl;

import app.dao.ProjectDao;
import app.entities.Project;
import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;


@Repository
public class ProjectDaoImpl implements ProjectDao {

    private static List<Project> projects = new LinkedList<>();

    static {
        DateTime startDate = DateTime.parse("2018-10-05");
        startDate.toDate();

        DateTime endDate = DateTime.parse("2019-03-01");

        projects.add(new Project(0, "Cyber Pineapple",
                "someCyberPineAppleUrl",
                startDate.toDate(),
                endDate.toDate(),
                360));

        endDate = DateTime.parse("2019-05-01");

        projects.add(new Project(1, "Purple Warm&Cold Hammer",
                "somePurpleWarm&ColdHammerUrl",
                startDate.toDate(),
                endDate.toDate(),
                514));

    }

    @Override
    public synchronized List<Project> getAll() {
        return projects;
    }

    @Override
    public synchronized Project findById(int id) {
        for (Project project : projects) {
            if (project.getId() == id) {
                return project;
            }
        }
        throw new IllegalArgumentException("No project by id=" + id);
    }


    @Override
    public synchronized void save(Project project) {
        projects.add(project);
    }

    @Override
    public synchronized void delete(Project retiringProject) {
        for (Project project : projects) {
            if (project.equals(retiringProject)) {
                projects.remove(retiringProject);
                return;
            }
        }
    }

    @Override
    public synchronized void edit(Project project) {
        int index = projects.indexOf(findById(project.getId()));
        projects.remove(index);
        projects.add(index, project);

    }
}
