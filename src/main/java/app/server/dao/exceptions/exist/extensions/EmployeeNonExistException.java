package app.server.dao.exceptions.exist.extensions;

import app.server.dao.exceptions.exist.NonExistException;
import app.server.entities.Employee;

public class EmployeeNonExistException extends NonExistException {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeNonExistException(String message, Employee employee) {
        super(message);
        this.employee = employee;
    }
}
