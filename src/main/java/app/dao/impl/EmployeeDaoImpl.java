package app.dao.impl;

import app.dao.EmployeeDao;
import app.entities.Employee;

import java.util.LinkedList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private static List<Employee> employees = new LinkedList<>();

    static {

    }


    @Override
    public Employee findById(int id) {
        return employees.get(id);
    }

    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        employees.remove(employee);
    }
}
