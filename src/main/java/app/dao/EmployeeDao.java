package app.dao;

import app.entities.Employee;

public interface EmployeeDao {

    Employee findById(int id);

    void save(Employee employee);

    void delete(Employee employee);
}
