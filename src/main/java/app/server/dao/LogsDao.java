package app.server.dao;

import app.server.entities.Logs;
import app.server.entities.namespace.LogsNamespace;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogsDao {

    List<Logs> getLogFor(LogsNamespace logsNamespace);

    List<Logs> getAll();

    void save(Logs logs);

    void delete(Logs logs);
}
