package app.dao;

import app.entities.Logs;

import java.util.List;

public interface LogsDao {

    List<Logs> getAll();

    void save(Logs logs);

    void delete(Logs logs);
}
