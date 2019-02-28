package app.dao;

import app.entities.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAll();

    Employee findById(int id);

    void save(Employee employee);

    void delete(Employee employee);
}
