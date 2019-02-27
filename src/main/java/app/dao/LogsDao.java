package app.dao;

import app.entities.Logs;

public interface LogsDao {

    Logs findById(int id);

    void save(Logs logs);

    void delete(Logs logs);
}
