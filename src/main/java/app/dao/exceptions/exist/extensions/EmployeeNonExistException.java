package app.dao.exceptions.exist.extensions;

import app.dao.exceptions.exist.NonExistException;
import app.entities.Employee;

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
