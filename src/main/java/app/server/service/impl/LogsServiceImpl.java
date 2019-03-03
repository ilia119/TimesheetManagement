package app.server.service.impl;

import app.server.dao.LogsDao;
import app.server.entities.Logs;
import app.server.entities.namespace.LogsNamespace;
import app.server.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogsServiceImpl implements LogsService {

    @Autowired
    private LogsDao logsDao;

    @Override
    public List<Logs> getLogFor(LogsNamespace logsNamespace) {
        return logsDao.getLogFor(logsNamespace);
    }

    @Override
    public List<Logs> getAllLogs() {
        return logsDao.getAll();
    }

    @Override
    public void save(Logs logs) {
        logsDao.save(logs);
    }

    @Override
    public void delete(Logs logs) {
        logsDao.delete(logs);
    }
}
