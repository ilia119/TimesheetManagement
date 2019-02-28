package app.dao;

import app.entities.Logs;
import app.entities.namespace.LogsNamespace;

import java.util.List;

public interface LogsDao {

    List<Logs> getLogFor(LogsNamespace logsNamespace);

    List<Logs> getAll();

    void save(Logs logs);

    void delete(Logs logs);
}
