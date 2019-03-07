package app.dao.impl;

import app.dao.ProjectDao;
import app.dao.exceptions.exist.extensions.ProjectNonExistException;
import app.dao.exceptions.id.extensions.ProjectNotFoundByIdException;
import app.entities.Project;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


@Repository
public class ProjectDaoImpl implements ProjectDao {

    private static List<Project> projects = new LinkedList<>();

    static {
        Calendar calendarStartDate = Calendar.getInstance();
        calendarStartDate.clear();
        calendarStartDate.set(Calendar.YEAR, 2018);
        calendarStartDate.set(Calendar.MONTH, Calendar.OCTOBER);
        calendarStartDate.set(Calendar.DAY_OF_MONTH, 5);

        Calendar calendarEndDate = Calendar.getInstance();
        calendarEndDate.clear();
        calendarEndDate.set(Calendar.YEAR, 2019);
        calendarEndDate.set(Calendar.MONTH, Calendar.MARCH);
        calendarEndDate.set(Calendar.DAY_OF_MONTH, 1);

        long manHours = 3600000000L;

        projects.add(new Project(0, "Cyber Pineapple",
                "someCyberPineAppleUrl",
                new Date(calendarStartDate.getTimeInMillis()),
                new Date(calendarEndDate.getTimeInMillis()),
                manHours));

        calendarEndDate.clear();
        calendarEndDate.set(Calendar.YEAR, 2019);
        calendarEndDate.set(Calendar.MONTH, Calendar.MAY);
        calendarEndDate.set(Calendar.DAY_OF_MONTH, 1);

        manHours = 5400000000L;

        projects.add(new Project(1, "Purple Warm&Cold Hammer",
                "somePurpleWarm&ColdHammerUrl",
                new Date(calendarStartDate.getTimeInMillis()),
                new Date(calendarEndDate.getTimeInMillis()),
                manHours));

    }

    @Override
    public synchronized List<Project> getAll() {
        return projects;
    }

    @Override
    public synchronized Project findById(int id) {
        try {
            for (Project project : projects) {
                if (project.getId() == id) {
                    return project;
                }
            }
            throw new ProjectNotFoundByIdException("No project by id = "
                    + id, id);
        } catch (ProjectNotFoundByIdException exception) {
            exception.printStackTrace();
        }
        return null;
    }


    @Override
    public synchronized void save(Project project) {
        projects.add(project);
    }

    @Override
    public synchronized void delete(Project retiringProject) {
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

    @Override
    public synchronized void edit(Project project) {
        int index = projects.indexOf(findById(project.getId()));
        projects.remove(index);
        projects.add(index, project);

    }
}
