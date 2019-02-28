package app.dao.impl;

import app.dao.LogsDao;
import app.dao.exceptions.exist.extensions.LogsNonExistException;
import app.entities.Logs;
import app.entities.namespace.LogsNamespace;

import java.util.LinkedList;
import java.util.List;

public class LogsDaoImpl implements LogsDao {

    private static List<Logs> logsList = new LinkedList<>();

    @Override
    public List<Logs> getLogFor(LogsNamespace logsNamespace) {
        return null;
    }

    @Override
    public List<Logs> getAll() {
        return logsList;
    }

    @Override
    public void save(Logs logs) {
        logsList.add(logs);
    }

    @Override
    public void delete(Logs retiringLogs) {
        try {
            for (Logs logs : logsList) {
                if (logs.equals(retiringLogs)) {
                    logsList.remove(retiringLogs);
                    return;
                }
            }
            throw new LogsNonExistException("Not exist this logs: "
                    + retiringLogs.toString(), retiringLogs);
        } catch (LogsNonExistException exception) {
            exception.printStackTrace();
        }
    }
}
