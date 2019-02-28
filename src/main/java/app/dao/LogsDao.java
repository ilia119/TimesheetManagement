package app.dao;

import app.entities.Logs;

public interface LogsDao {

    void save(Logs logs);

    void delete(Logs logs);
}
