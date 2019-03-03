package app.server.service;

import app.server.entities.Logs;
import app.server.entities.namespace.LogsNamespace;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogsService {

    List<Logs> getLogFor(LogsNamespace logsNamespace);

    List<Logs> getAllLogs();

    void save(Logs logs);

    void delete(Logs logs);
}
