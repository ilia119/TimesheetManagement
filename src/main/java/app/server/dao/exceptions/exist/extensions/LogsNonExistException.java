package app.server.dao.exceptions.exist.extensions;

import app.server.dao.exceptions.exist.NonExistException;
import app.server.entities.Logs;

public class LogsNonExistException extends NonExistException {

    private Logs logs;

    public Logs getLogs() {
        return logs;
    }

    public LogsNonExistException(String message, Logs logs) {
        super(message);
        this.logs = logs;
    }
}
