package app.service.impl;

import app.dao.LogsDao;
import app.entities.Logs;
import app.entities.namespace.LogsNamespace;
import app.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogsServiceImpl implements LogsService {

    @Autowired
    private LogsDao logsDao;

    @Override
    public List<Logs> getLogFor(LogsNamespace logsNamespace) {
        return null;
    }

    @Override
    public Logs findById(int id) {
        return logsDao.findById(id);
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
