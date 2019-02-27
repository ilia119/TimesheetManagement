package app.service.impl;

import app.dao.LogsDao;
import app.dao.factory.FactoryDao;
import app.entities.Logs;
import app.service.LogsService;
import org.springframework.stereotype.Service;

@Service
public class LogsServiceImpl implements LogsService {

    private LogsDao logsDao =
            FactoryDao.getInstance().getLogsDao();

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
