package app.dao.impl;

import app.dao.ProjectDao;
import app.dao.exceptions.exist.extensions.ProjectNonExistException;
import app.dao.exceptions.id.extensions.ProjectNotFoundByIdException;
import app.entities.Project;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ProjectDaoImpl implements ProjectDao {

    private static List<Project> projects = new LinkedList<>();

    static {
        Calendar calendarStartDate = Calendar.getInstance();
        calendarStartDate.clear();
        calendarStartDate.set(Calendar.YEAR, 2019);
        calendarStartDate.set(Calendar.MONTH, Calendar.JANUARY);
        calendarStartDate.set(Calendar.DAY_OF_MONTH, 5);

        Calendar calendarEndDate = Calendar.getInstance();
        calendarEndDate.clear();
        calendarEndDate.set(Calendar.YEAR, 2019);
        calendarEndDate.set(Calendar.MONTH, Calendar.MARCH);
        calendarEndDate.set(Calendar.DAY_OF_MONTH, 1);

        long MAN_HOURS = 1440000000L;

        projects.add(new Project(0, "Cyber Pineapple", "someCyberPineAppleUrl",
                new Date(calendarStartDate.getTimeInMillis()), new Date(calendarEndDate.getTimeInMillis()),
                MAN_HOURS));

        calendarEndDate.clear();
        calendarEndDate.set(Calendar.YEAR, 2019);
        calendarEndDate.set(Calendar.MONTH, Calendar.MAY);
        calendarEndDate.set(Calendar.DAY_OF_MONTH, 1);

        MAN_HOURS = 2880000000L;

        projects.add(new Project(1, "Purple Warm&Cold Hammer", "somePurpleWarm&ColdHammerUrl",
                new Date(calendarStartDate.getTimeInMillis()), new Date(calendarEndDate.getTimeInMillis()),
                MAN_HOURS));

    }

    @Override
    public List<Project> getAll() {
        return projects;
    }

    @Override
    public Project findById(int id) {
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
