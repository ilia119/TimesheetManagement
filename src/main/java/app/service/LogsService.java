package app.service;

import app.entities.Logs;
import app.entities.namespace.LogsNamespace;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogsService {

    List<Logs> getLogFor(LogsNamespace logsNamespace);

    List<Logs> getAllLogs();

    void save(Logs logs);

    void delete(Logs logs);
}
