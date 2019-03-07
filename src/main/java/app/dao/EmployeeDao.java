package app.dao;

import app.entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {

    List<Employee> getAll();

    Employee findById(int id);

    void save(Employee employee);

    void delete(Employee employee);

    void edit(Employee employee);
}
