package app.dao.impl;

import app.dao.LogsDao;
import app.entities.Logs;

import java.util.LinkedList;
import java.util.List;

public class LogsDaoImpl implements LogsDao {

    private static List<Logs> logsList = new LinkedList<>();

    static {

    }

    @Override
    public void save(Logs logs) {
        logsList.add(logs);
    }

    @Override
    public void delete(Logs logs) {
        logsList.remove(logs);
    }
}
