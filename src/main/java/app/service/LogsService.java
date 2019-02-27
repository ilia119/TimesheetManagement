package app.service;

import app.entities.Logs;

public interface LogsService {

    Logs findById(int id);

    void save(Logs logs);

    void delete(Logs logs);
}
